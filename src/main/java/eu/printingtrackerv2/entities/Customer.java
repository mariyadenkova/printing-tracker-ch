package eu.printingtrackerv2.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String uic;

    /*@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "customers_addresses",
    joinColumns = @JoinColumn(name = "customer_id"),
    inverseJoinColumns = @JoinColumn(name = "address_id"))*/

    @ManyToMany(mappedBy = "customers",cascade = CascadeType.ALL)
    private Set<Address> addresses;

    @OneToMany(mappedBy = "customer", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<PrintingDevice> printingDevices;

    public Customer() {

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

    public String getUic() {
        return uic;
    }

    public void setUic(String uic) {
        this.uic = uic;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<PrintingDevice> getPrintingDevices() {
        return printingDevices;
    }

    public void setPrintingDevices(Set<PrintingDevice> printingDevices) {
        this.printingDevices = printingDevices;
    }
}
