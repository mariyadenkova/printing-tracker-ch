package eu.printingtrackerv2.service;


import eu.printingtrackerv2.entities.Address;
import eu.printingtrackerv2.model.bindingModels.AddressBindingModels.AddAddressBindingModel;
import eu.printingtrackerv2.model.bindingModels.AddressBindingModels.AddressBindingModel;
import eu.printingtrackerv2.model.viewModels.addressViewModels.AddressViewModel;
import eu.printingtrackerv2.model.viewModels.userViewModel.AddUserToAddressViewModel;

import java.util.List;
import java.util.Set;

public interface AddressService {

    void save(AddAddressBindingModel addAddressBindingModel);

    Set<AddressViewModel> findAllAddresses();

    Set<AddressViewModel> findAllAddressesByCustomerId(Long customerId);

}
