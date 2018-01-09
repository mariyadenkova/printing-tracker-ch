package eu.printingtrackerv2.serviceImpl;


import com.sun.org.apache.xpath.internal.operations.Mod;
import eu.printingtrackerv2.entities.Address;
import eu.printingtrackerv2.entities.Customer;
import eu.printingtrackerv2.model.bindingModels.AddressBindingModels.AddAddressBindingModel;
import eu.printingtrackerv2.model.bindingModels.AddressBindingModels.AddressBindingModel;
import eu.printingtrackerv2.model.bindingModels.CustomerBindingModels.AddCustomerBindingModel;
import eu.printingtrackerv2.model.viewModels.addressViewModels.AddressViewModel;
import eu.printingtrackerv2.model.viewModels.customerViewModels.CustomerNameViewModel;
import eu.printingtrackerv2.repository.AddressRepository;
import eu.printingtrackerv2.repository.CustomerRepository;
import eu.printingtrackerv2.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void save(AddAddressBindingModel addAddressBindingModel) {
        Address address = this.modelMapper.map(addAddressBindingModel, Address.class);
        Set<Customer> customers = this.customerRepository.findAllByNameIn(addAddressBindingModel.getCustomers());
        address.setCustomers(customers);
        this.addressRepository.save(address);
    }

    @Override
    public Set<AddressViewModel> findAllAddresses() {
        Set<AddressViewModel> models = new HashSet<>();
        Set<Address> addresses = this.addressRepository.findAllAddresses();
        for(Address address : addresses) {
            AddressViewModel model = this.modelMapper.map(address, AddressViewModel.class);
            models.add(model);
        }
        return models;
    }

    @Override
    public Set<AddressViewModel> findAllAddressesByCustomerId(Long id) {
        Customer customer = this.customerRepository.findOne(id);
        Set<Address> addresses = this.addressRepository.findAllByCustomerId(id);
        Set<AddressViewModel> models = new HashSet<>();
        customer.setAddresses(addresses);
        for (Address address : addresses) {
            AddressViewModel model = this.modelMapper.map(address, AddressViewModel.class);
            models.add(model);
        }

        return models;
    }
}
