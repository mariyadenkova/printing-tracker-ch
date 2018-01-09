package eu.printingtrackerv2.model.viewModels.customerViewModels;


import eu.printingtrackerv2.entities.Address;
import eu.printingtrackerv2.model.viewModels.addressViewModels.AddressViewModel;

import java.util.List;
import java.util.Set;

public class CustomerViewModel {

    private Long id;

    private String name;

    private String uic;

    private Set<AddressViewModel> addresses;

    public CustomerViewModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUic() {
        return uic;
    }

    public void setUic(String uic) {
        this.uic = uic;
    }

}
