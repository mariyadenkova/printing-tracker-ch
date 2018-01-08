package eu.printingtrackerv2.model.bindingModels.AddressBindingModels;

import eu.printingtrackerv2.entities.Customer;
import eu.printingtrackerv2.model.bindingModels.CityBindingModels.CityBindingModel;
import eu.printingtrackerv2.model.bindingModels.CustomerBindingModels.CustomerBindingModel;
import eu.printingtrackerv2.model.viewModels.customerViewModels.CustomerViewModel;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

public class AddAddressBindingModel {

    //private String customerName;

    //private CityBindingModel city;

    @NotEmpty(message = "You must select at least one customer!")
    private String [] customers;

    private String street;

    private String businessCenterName;

    private String block;

    private String entrance;

    private String floor;

    private String appartmentN;

    private String officeN;

    private String comment;

    private String contactName;

    private String phoneNumber;

    private String email;

    public AddAddressBindingModel() {
    }

    public String[] getCustomers() {
        return customers;
    }

    public void setCustomers(String[] customers) {
        this.customers = customers;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBusinessCenterName() {
        return businessCenterName;
    }

    public void setBusinessCenterName(String businessCenterName) {
        this.businessCenterName = businessCenterName;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getAppartmentN() {
        return appartmentN;
    }

    public void setAppartmentN(String appartmentN) {
        this.appartmentN = appartmentN;
    }

    public String getOfficeN() {
        return officeN;
    }

    public void setOfficeN(String officeN) {
        this.officeN = officeN;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
