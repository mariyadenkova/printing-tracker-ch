package eu.printingtrackerv2.serviceImpl;

import eu.printingtrackerv2.entities.Package;
import eu.printingtrackerv2.model.bindingModels.PackageBindingModels.AddPackageBindingModel;
import eu.printingtrackerv2.model.viewModels.packageViewModels.PackageViewModel;
import eu.printingtrackerv2.repository.PackageRepository;
import eu.printingtrackerv2.service.PackageService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PackageServiceImpl implements PackageService {

    @Autowired
    private PackageRepository packageRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void save(AddPackageBindingModel addPackageBindingModel) {
        Package aPackage = this.modelMapper.map(addPackageBindingModel, Package.class);
        this.packageRepository.save(aPackage);
    }

    @Override
    public Set<PackageViewModel> findAllPackages() {
        Set<PackageViewModel> models = new HashSet<>();
        Set<Package> packages = this.packageRepository.findAllPackages();
        for(Package aPackage : packages) {
            PackageViewModel model = this.modelMapper.map(aPackage, PackageViewModel.class);
            models.add(model);
        }
        return models;
    }
}
