package se.iths.autofix.entity;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String type;
    private double price;
    private Date checkInDate;
    private Date checkOutDate;
    private String jobHistory;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Client client;



    public void setClient(Client client) {
        this.client = client;
    }

    public Maintenance(@NotEmpty String type, double price, Date checkInDate, Date checkOutDate) {
        this.type = type;
        this.price = price;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Maintenance() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobHistory() {
        return jobHistory;
    }

    public void setJobHistory(String jobHistory) {
        this.jobHistory = jobHistory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }


}
