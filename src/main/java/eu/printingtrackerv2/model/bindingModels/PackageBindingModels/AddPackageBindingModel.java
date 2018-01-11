package eu.printingtrackerv2.model.bindingModels.PackageBindingModels;


import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AddPackageBindingModel {

    //@NotNull
    //@Size(min = 1, message = "Invalid name")
    private String name;

    @NotNull
    private Long numbersMonoInPackage;

    @NotNull(message = "Invalid input")
    @DecimalMin("0.01")
    private double priceMonoPackage;

    @NotNull(message = "Invalid input")
    @DecimalMin("0.001")
    private double priceMonoCopyOverP;

    private Long numbersColorInPackage;

    private double priceColorPackage;

    private double priceColorCopyOverP;

    public AddPackageBindingModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumbersMonoInPackage() {
        return numbersMonoInPackage;
    }

    public void setNumbersMonoInPackage(Long numbersMonoInPackage) {
        this.numbersMonoInPackage = numbersMonoInPackage;
    }

    public double getPriceMonoPackage() {
        return priceMonoPackage;
    }

    public void setPriceMonoPackage(double priceMonoPackage) {
        this.priceMonoPackage = priceMonoPackage;
    }

    public double getPriceMonoCopyOverP() {
        return priceMonoCopyOverP;
    }

    public void setPriceMonoCopyOverP(double priceMonoCopyOverP) {
        this.priceMonoCopyOverP = priceMonoCopyOverP;
    }

    public Long getNumbersColorInPackage() {
        return numbersColorInPackage;
    }

    public void setNumbersColorInPackage(Long numbersColorInPackage) {
        this.numbersColorInPackage = numbersColorInPackage;
    }

    public double getPriceColorPackage() {
        return priceColorPackage;
    }

    public void setPriceColorPackage(double priceColorPackage) {
        this.priceColorPackage = priceColorPackage;
    }

    public double getPriceColorCopyOverP() {
        return priceColorCopyOverP;
    }

    public void setPriceColorCopyOverP(double priceColorCopyOverP) {
        this.priceColorCopyOverP = priceColorCopyOverP;
    }
}
