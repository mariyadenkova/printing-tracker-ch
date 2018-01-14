package eu.printingtrackerv2.model.bindingModels.AddressBindingModels;

import eu.printingtrackerv2.entities.City;
import eu.printingtrackerv2.entities.Customer;

import java.util.Set;

public class AddressBindingModel {

    //private Set<City> cities;
    private Set<Customer> customers;

    private String street;

    private String businessCenterName;

    private String block;

    private String entrance;

    private String floor;

    private String appartmentN;

    private String officeN;

    private String comment;

    public AddressBindingModel() {
    }

    /*public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }*/

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
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
}
