package eu.printingtrackerv2.model.bindingModels.CustomerBindingModels;


public class CustomerBindingModel {

    private Long id;

    private String name;

    //private Set<AddressBindingModel> addresses;

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
}
