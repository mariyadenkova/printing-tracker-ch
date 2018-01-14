package eu.printingtrackerv2.model.viewModels.addressViewModels;


import eu.printingtrackerv2.entities.City;

import java.util.Set;

public class AddressViewModel {
    private Long id;

    //private String customerName;

    //private String city;

    private String street;

    private String businessCenterName;

    private String block;

    private String entrance;

    private String floor;

    private String appartmentN;

    private String officeN;

    private String comment;

    /*private String firstName;

    private String lastName;

    private String username;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }*/

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

    /*public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }*/

    /*public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }*/
}
