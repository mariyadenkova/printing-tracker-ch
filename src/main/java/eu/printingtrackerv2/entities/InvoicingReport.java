package eu.printingtrackerv2.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoicingReports")
public class InvoicingReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "printingDevice_id", referencedColumnName = "id")
    private PrintingDevice printingDevice;

    @Column(name = "date_created", updatable = false)
    private Date dateCreated;

    @Column(name = "mono_counter_inv")
    private Long monoCounterInv;

    @Column(name = "mono_counter_prev_inv")
    private Long monoCounterPrevInv;

    @Column(name = "mono_counter_for_inv")
    private Long monoCounterForInv;

    @Column(name = "color_counter_inv")
    private Long colorCounterInv;

    @Column(name = "color_counter_prev_inv")
    private Long colorCounterPrevInv;

    @Column(name = "color_counter_for_inv")
    private Long colorCounterForInv;

    @Column(name = "total_for_invoicing")
    private double TotalForInvoicing;

    public InvoicingReport() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PrintingDevice getPrintingDevice() {
        return printingDevice;
    }

    public void setPrintingDevice(PrintingDevice printingDevice) {
        this.printingDevice = printingDevice;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Long getMonoCounterInv() {
        return monoCounterInv;
    }

    public void setMonoCounterInv(Long monoCounterInv) {
        this.monoCounterInv = monoCounterInv;
    }

    public Long getMonoCounterPrevInv() {
        return monoCounterPrevInv;
    }

    public void setMonoCounterPrevInv(Long monoCounterPrevInv) {
        this.monoCounterPrevInv = monoCounterPrevInv;
    }

    public Long getMonoCounterForInv() {
        return monoCounterForInv;
    }

    public void setMonoCounterForInv(Long monoCounterForInv) {
        this.monoCounterForInv = monoCounterForInv;
    }

    public Long getColorCounterInv() {
        return colorCounterInv;
    }

    public void setColorCounterInv(Long colorCounterInv) {
        this.colorCounterInv = colorCounterInv;
    }

    public Long getColorCounterPrevInv() {
        return colorCounterPrevInv;
    }

    public void setColorCounterPrevInv(Long colorCounterPrevInv) {
        this.colorCounterPrevInv = colorCounterPrevInv;
    }

    public Long getColorCounterForInv() {
        return colorCounterForInv;
    }

    public void setColorCounterForInv(Long colorCounterForInv) {
        this.colorCounterForInv = colorCounterForInv;
    }

    public double getTotalForInvoicing() {
        return TotalForInvoicing;
    }

    public void setTotalForInvoicing(double totalForInvoicing) {
        TotalForInvoicing = totalForInvoicing;
    }
}
