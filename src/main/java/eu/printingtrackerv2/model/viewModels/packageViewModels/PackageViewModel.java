package eu.printingtrackerv2.model.viewModels.packageViewModels;

public class PackageViewModel {

    private Long id;

    private String name;

    private Long numbersMonoInPackage;

    private double priceMonoPackage;

    private double priceMonoCopyOverP;

    private Long numbersColorInPackage;

    private double priceColorPackage;

    private double priceColorCopyOverP;

    public PackageViewModel() {
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
