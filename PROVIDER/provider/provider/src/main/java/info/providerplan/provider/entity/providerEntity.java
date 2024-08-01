package info.providerplan.provider.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jio", schema = "plans")
public class providerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "s_no")
    private int s_no;

//    @Column(name = "network")
//    private String network;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "valid_days")
    private int valid_days;

    @Column(name = "per_day_cost")
    private double per_day_cost;

    @Override
    public String toString() {
        return "ProviderEntity [s_no=" + s_no + ", description=" + description + ", price="
                + price + ", validDays=" + valid_days + ", per_day_cost=" + per_day_cost + "]";
    }

    // Getters and setters
    public int gets_no() {
        return s_no;
    }

    public void sets_no(int s_no) {
        this.s_no = s_no;
    }

//    public String getnetwork() {
//        return network;
//    }
//
//    public void setnetwork(String network) {
//        this.network = network;
//    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public double getprice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getvalid_days() {
        return valid_days;
    }

    public void setValid_days(int valid_days) {
        this.valid_days = valid_days;
    }

    public double getper_day_cost() {
        return per_day_cost;
    }

    public void setper_day_cost(double per_day_cost) {
        this.per_day_cost = per_day_cost;
    }
}
