package eu.printingtrackerv2.model.bindingModels.CustomerBindingModels;

import eu.printingtrackerv2.entities.Address;
import eu.printingtrackerv2.model.bindingModels.AddressBindingModels.AddressBindingModel;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;


public class AddCustomerBindingModel {

    @NotNull
    @Size(min = 3, message = "Invalid name")
    private String name;

    @NotNull
    @Size(min = 9, message = "Invalid uic")
    private String uic;



    public AddCustomerBindingModel() {
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
