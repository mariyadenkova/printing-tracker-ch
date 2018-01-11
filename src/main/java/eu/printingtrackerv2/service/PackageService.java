package eu.printingtrackerv2.service;

import eu.printingtrackerv2.model.bindingModels.PackageBindingModels.AddPackageBindingModel;
import eu.printingtrackerv2.model.viewModels.packageViewModels.PackageViewModel;

import java.util.Set;

public interface PackageService {

    void save(AddPackageBindingModel addPackageBindingModel);

    Set<PackageViewModel> findAllPackages();
}
