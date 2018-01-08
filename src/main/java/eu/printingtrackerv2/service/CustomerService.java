package eu.printingtrackerv2.service;


import eu.printingtrackerv2.model.bindingModels.CustomerBindingModels.AddCustomerBindingModel;
import eu.printingtrackerv2.model.bindingModels.CustomerBindingModels.CustomerBindingModel;
import eu.printingtrackerv2.model.viewModels.customerViewModels.CustomerNameViewModel;
import eu.printingtrackerv2.model.viewModels.customerViewModels.CustomerViewModel;

import java.util.Set;

public interface CustomerService {

    CustomerViewModel save(CustomerBindingModel customerBindingModel);

    Set<CustomerViewModel> getAllCustomers();

    Set<CustomerNameViewModel> getAllCustomersNames();

}
