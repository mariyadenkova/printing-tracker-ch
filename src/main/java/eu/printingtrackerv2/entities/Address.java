package eu.printingtrackerv2.entities;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "addresses_cities",
    joinColumns = @JoinColumn(name = "address_id"),
    inverseJoinColumns = @JoinColumn(name = "city_id"))
    private Set<City> cities;*/

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

    @OneToMany (mappedBy = "address", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<PrintingDevice> printingDevices;

    @ManyToMany()
    @JoinTable(name = "customers_addresses",
            joinColumns = @JoinColumn(name = "address_id"),
            inverseJoinColumns = @JoinColumn(name = "customer_id", referencedColumnName = "id"))
    private Set<Customer> customers;

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
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

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public Set<PrintingDevice> getPrintingDevices() {
        return printingDevices;
    }

    public void setPrintingDevices(Set<PrintingDevice> printingDevices) {
        this.printingDevices = printingDevices;
    }
}
