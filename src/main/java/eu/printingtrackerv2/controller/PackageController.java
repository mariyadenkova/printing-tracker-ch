package eu.printingtrackerv2.controller;

import eu.printingtrackerv2.model.bindingModels.CustomerBindingModels.AddCustomerBindingModel;
import eu.printingtrackerv2.model.bindingModels.PackageBindingModels.AddPackageBindingModel;
import eu.printingtrackerv2.model.viewModels.customerViewModels.CustomerViewModel;
import eu.printingtrackerv2.model.viewModels.packageViewModels.PackageViewModel;
import eu.printingtrackerv2.service.AddressService;
import eu.printingtrackerv2.service.CustomerService;
import eu.printingtrackerv2.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Set;

@Controller
@RequestMapping("/packages")
public class PackageController {

    @Autowired
    private PackageService packageService;

    @GetMapping("")
    public String getPackagePage(Model model){
        Set<PackageViewModel> packages = this.packageService.findAllPackages();
        model.addAttribute("packages", packages);
        return "packages";
    }

    @GetMapping("/add")
    public String getAddPackagePage(@ModelAttribute AddPackageBindingModel addPackageBindingModel) {
        return "package-add";
    }

    @PostMapping("/add")
    public String addPackage(@Valid @ModelAttribute AddPackageBindingModel addPackageBindingModel, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "package-add";
        }

        this.packageService.save(addPackageBindingModel);

        return "redirect:/packages";
    }

}
