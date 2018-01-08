package eu.printingtrackerv2.model.bindingModels.PrintingDeviceBindingModels;

import eu.printingtrackerv2.entities.Brand;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AddPrintingDeviceBindingModel {

    @NotEmpty(message = "You must select one customer!")
    private String [] customer;

    @NotEmpty(message = "You must select one brand!")
    private String brand;

    @NotEmpty(message = "You must enter a model!")
    private String model;

    @NotEmpty(message = "You must enter unique serial number!")
    private String serNum;

    @NotEmpty(message = "You must select one type!")
    private String type;

    @NotEmpty(message = "You must chose a date!")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateInstalled;

    @NotEmpty(message = "You must enter the installed mono counter!")
    private Long monoCounterInst;

    private Long colorCounterInst;

    @NotEmpty(message = "You must select one address!")
    private String[] address;

    @NotEmpty(message = "You must select one user!")
    private String user;

    public AddPrintingDeviceBindingModel() {
    }

    public String[] getCustomer() {
        return customer;
    }

    public void setCustomer(String[] customer) {
        this.customer = customer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerNum() {
        return serNum;
    }

    public void setSerNum(String serNum) {
        this.serNum = serNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateInstalled() {
        return dateInstalled;
    }

    public void setDateInstalled(Date dateInstalled) {
        this.dateInstalled = dateInstalled;
    }

    public Long getMonoCounterInst() {
        return monoCounterInst;
    }

    public void setMonoCounterInst(Long monoCounterInst) {
        this.monoCounterInst = monoCounterInst;
    }

    public Long getColorCounterInst() {
        return colorCounterInst;
    }

    public void setColorCounterInst(Long colorCounterInst) {
        this.colorCounterInst = colorCounterInst;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
