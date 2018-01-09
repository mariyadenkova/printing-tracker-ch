package eu.printingtrackerv2.controller;

import eu.printingtrackerv2.model.bindingModels.AddressBindingModels.AddressBindingModel;
import eu.printingtrackerv2.model.bindingModels.CustomerBindingModels.AddCustomerBindingModel;
import eu.printingtrackerv2.model.bindingModels.CustomerBindingModels.CustomerBindingModel;
import eu.printingtrackerv2.model.viewModels.addressViewModels.AddressViewModel;
import eu.printingtrackerv2.model.viewModels.customerViewModels.CustomerNameViewModel;
import eu.printingtrackerv2.model.viewModels.customerViewModels.CustomerViewModel;
import eu.printingtrackerv2.repository.CustomerRepository;
import eu.printingtrackerv2.service.AddressService;
import eu.printingtrackerv2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Set;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private AddressService addressService;

    @GetMapping("")
    public String getCustomerPage(Model model){
        Set<CustomerViewModel> customers = this.customerService.getAllCustomers();
        model.addAttribute("customers", customers);
        return "customers";
    }

    @GetMapping("/add")
    public String getAddCustomerPage(@ModelAttribute AddCustomerBindingModel addCustomerBindingModel) {
        return "customers-add";
    }

    @PostMapping("/add")
    public String addCustomer(@Valid @ModelAttribute AddCustomerBindingModel addCustomerBindingModel, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "customers-add";
        }

        this.customerService.save(addCustomerBindingModel);

        return "redirect:/customers";
    }

}

/*@RestController
@RequestMapping("/allCustomers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public ResponseEntity<Set<CustomerViewModel>> getCustomerPage(){
        Set<CustomerViewModel> customers = this.customerService.getAllCustomers();

        if(customers == null) {
            return new ResponseEntity<Set<CustomerViewModel>>(HttpStatus.NOT_FOUND);
        }

        ResponseEntity<Set<CustomerViewModel>> responseEntity = new ResponseEntity(customers, HttpStatus.OK);

        return responseEntity;
    }

    @PostMapping("")
    public ResponseEntity<CustomerViewModel> saveCustomer(@RequestBody CustomerBindingModel customerBindingModel) {
        CustomerViewModel customerViewModel = this.customerService.save(customerBindingModel);

        return new ResponseEntity(customerViewModel, HttpStatus.OK);
    }

}*/


