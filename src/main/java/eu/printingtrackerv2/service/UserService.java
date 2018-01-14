package eu.printingtrackerv2.service;

import eu.printingtrackerv2.model.bindingModels.RegistrationModel;
import eu.printingtrackerv2.model.viewModels.userViewModel.AddUserToAddressViewModel;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Set;

public interface UserService extends UserDetailsService{

    void register(RegistrationModel registrationModel);

    /*@PreAuthorize("hasRole('ADMIN')")
    void delete();*/

    Set<AddUserToAddressViewModel> findAllUsernames();
}

