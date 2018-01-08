package eu.printingtrackerv2.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "packages")
public class Package {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "numbers_mono_in_package")
    private Long numbersMonoInPackage;

    @Column(name = "price_mono_package")
    private double priceMonoPackage;

    @Column(name = "price_mono_copy_over_p")
    private double priceMonoCopyOverP;

    @Column(name = "numbers_color_in_package")
    private Long numbersColorInPackage;

    @Column(name = "price_color_package")
    private double priceColorPackage;

    @Column(name = "price_color_copy_over_p")
    private double priceColorCopyOverP;

    @OneToMany(mappedBy = "aPackage", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<PrintingDevice> printingDevice;

    public Package() {
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

    public Set<PrintingDevice> getPrintingDevice() {
        return printingDevice;
    }

    public void setPrintingDevice(Set<PrintingDevice> printingDevice) {
        this.printingDevice = printingDevice;
    }
}
