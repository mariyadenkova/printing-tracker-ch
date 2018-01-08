package eu.printingtrackerv2.service;

import eu.printingtrackerv2.model.bindingModels.RegistrationModel;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{

    void register(RegistrationModel registrationModel);

    /*@PreAuthorize("hasRole('ADMIN')")
    void delete();*/
}
