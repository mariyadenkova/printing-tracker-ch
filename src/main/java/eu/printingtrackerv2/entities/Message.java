package eu.printingtrackerv2.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "printingDevice_id", referencedColumnName = "id")
    private PrintingDevice printingDevice;

    @ManyToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(name = "date_published", updatable = false)
    private Date datePublished;

    @Column(name = "mono_counter")
    private Long monoCounter;

    @Column(name = "color_counter")
    private Long colorCounter;

    public Message() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public Long getMonoCounter() {
        return monoCounter;
    }

    public void setMonoCounter(Long monoCounter) {
        this.monoCounter = monoCounter;
    }

    public Long getColorCounter() {
        return colorCounter;
    }

    public void setColorCounter(Long colorCounter) {
        this.colorCounter = colorCounter;
    }
}
