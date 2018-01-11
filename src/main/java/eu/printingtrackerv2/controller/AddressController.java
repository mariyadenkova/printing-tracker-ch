package eu.printingtrackerv2.controller;

import eu.printingtrackerv2.model.bindingModels.AddressBindingModels.AddAddressBindingModel;
import eu.printingtrackerv2.model.bindingModels.AddressBindingModels.AddressBindingModel;
import eu.printingtrackerv2.model.bindingModels.CustomerBindingModels.CustomerBindingModel;
import eu.printingtrackerv2.model.viewModels.addressViewModels.AddressViewModel;
import eu.printingtrackerv2.model.viewModels.customerViewModels.CustomerNameViewModel;
import eu.printingtrackerv2.model.viewModels.customerViewModels.CustomerViewModel;
import eu.printingtrackerv2.repository.AddressRepository;
import eu.printingtrackerv2.repository.CustomerRepository;
import eu.printingtrackerv2.service.AddressService;
import eu.printingtrackerv2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class AddressController {

    @Autowired
    private AddressService addressService;

    @Autowired
    private CustomerService customerService;

    @ModelAttribute("customers")
    public Set<CustomerNameViewModel> getCustomersNames() {
        return this.customerService.getAllCustomersNames();
    }

    @GetMapping("/address")
    public String getAddressPage(Model model){
        Set<AddressViewModel> addresses = this.addressService.findAllAddresses();
        model.addAttribute("addresses", addresses);
        return "address";
    }

    @GetMapping("/address/customer/{customerId}")
    public String getCustomerAddressesPage(Model model, @PathVariable Long customerId) {
        Set<AddressViewModel> addresses = this.addressService.findAllAddressesByCustomerId(customerId);
        model.addAttribute("addresses", addresses);
        return "address-customer";
    }

    @GetMapping("/address/add")
    public String getAddAddressPage(@ModelAttribute AddAddressBindingModel addAddressBindingModel){
        return "address-add";
    }

    @PostMapping("/address/add")
    public String addAddressPage(@Valid @ModelAttribute AddAddressBindingModel addAddressBindingModel, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "address-add";
        }

        this.addressService.save(addAddressBindingModel);

        return "redirect:/address";
    }

}
