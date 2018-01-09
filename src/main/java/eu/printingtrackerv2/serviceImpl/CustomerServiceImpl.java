package eu.printingtrackerv2.serviceImpl;


import eu.printingtrackerv2.entities.Address;
import eu.printingtrackerv2.entities.Customer;
import eu.printingtrackerv2.model.bindingModels.CustomerBindingModels.AddCustomerBindingModel;
import eu.printingtrackerv2.model.bindingModels.CustomerBindingModels.CustomerBindingModel;
import eu.printingtrackerv2.model.viewModels.customerViewModels.CustomerNameViewModel;
import eu.printingtrackerv2.model.viewModels.customerViewModels.CustomerViewModel;
import eu.printingtrackerv2.repository.AddressRepository;
import eu.printingtrackerv2.repository.CustomerRepository;
import eu.printingtrackerv2.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ModelMapper modelMapper;

    /*@Override
    @Transactional
    public CustomerViewModel save(CustomerBindingModel customerBindingModel) {
        Customer customer = this.modelMapper.map(customerBindingModel, Customer.class);
        this.customerRepository.save(customer);
        CustomerViewModel customerViewModel = this.modelMapper.map(customer, CustomerViewModel.class);
        return customerViewModel;
    }*/

    @Override
    public void save(AddCustomerBindingModel addCustomerBindingModel) {
        Customer customer = this.modelMapper.map(addCustomerBindingModel, Customer.class);
        this.customerRepository.save(customer);
    }

    @Override
    public Set<CustomerViewModel> getAllCustomers() {
        Set<Customer> customers = this.customerRepository.findAllCustomers();
        Set<CustomerViewModel> customerViewModels = new HashSet<>();
        for (Customer customer : customers) {
            CustomerViewModel customerViewModel = modelMapper.map(customer, CustomerViewModel.class);
            customerViewModels.add(customerViewModel);
        }

        return customerViewModels;
    }

    @Override
    public Set<CustomerNameViewModel> getAllCustomersNames() {
        Set<CustomerNameViewModel> customerModels = new HashSet<>();
        Set<Customer> customers = this.customerRepository.findAllCustomers();
        for(Customer customer : customers) {
            CustomerNameViewModel viewModel = this.modelMapper.map(customer, CustomerNameViewModel.class);
            customerModels.add(viewModel);
        }
        return customerModels;
    }


}
