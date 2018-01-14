package eu.printingtrackerv2.serviceImpl;

import eu.printingtrackerv2.configuration.Errors;
import eu.printingtrackerv2.entities.User;
import eu.printingtrackerv2.model.bindingModels.RegistrationModel;
import eu.printingtrackerv2.model.viewModels.userViewModel.AddUserToAddressViewModel;
import eu.printingtrackerv2.repository.UserRepository;
import eu.printingtrackerv2.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void register(RegistrationModel registrationModel) {
        User user = this.modelMapper.map(registrationModel, User.class);
        String encryptedPassword = this.bCryptPasswordEncoder.encode(registrationModel.getPassword());
        user.setPassword(encryptedPassword);
        user.setAccountNonExpired(true);
        user.setAccountNonLocked(true);
        user.setEnabled(true);
        user.setCredentialsNonExpired(true);
        this.userRepository.save(user);
    }

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findOneByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException(Errors.INVALID_CREDENTIALS);
        }
        return user;
    }

    @Override
    public Set<AddUserToAddressViewModel> findAllUsernames() {
        Set<AddUserToAddressViewModel> addUserModels = new HashSet<>();
        Set<User> users = this.userRepository.findAllUsers();
        for (User user : users) {
            AddUserToAddressViewModel viewModel = this.modelMapper.map(user, AddUserToAddressViewModel.class);
            addUserModels.add(viewModel);
        }
        return addUserModels;
    }

}
