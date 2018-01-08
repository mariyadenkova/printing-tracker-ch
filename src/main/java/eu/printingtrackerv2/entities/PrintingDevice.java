package eu.printingtrackerv2.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "printingDevices")
public class PrintingDevice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @Enumerated(EnumType.STRING)
    private Brand brand;

    @Column(name = "model")
    private String model;

    @Column(name = "ser_num", updatable = false)
    private String serNum;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(name = "date_installed", updatable = false)
    private Date dateInstalled;

    @Column(name = "mono_counter_inst")
    private Long monoCounterInst;

    @Column(name = "color_counter_inst")
    private Long colorCounterInst;

    @ManyToOne()
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @ManyToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "printingDevice", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<InvoicingReport> invoicingReports;

    @OneToMany(mappedBy = "printingDevice", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<Message> messages;

    @ManyToOne()
    @JoinColumn(name = "package_id", referencedColumnName = "id")
    private Package aPackage;

    public PrintingDevice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<InvoicingReport> getInvoicingReports() {
        return invoicingReports;
    }

    public void setInvoicingReports(Set<InvoicingReport> invoicingReports) {
        this.invoicingReports = invoicingReports;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }
}
