/**
 * 
 */
package info.providerplan.provider.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="airtel", schema="plans")
public class airtelEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="s_no")
	private int s_no;
//	@Column(name="network")
//	private String network;
	@Column(name="description")
	private String description;
	@Column(name="price")
	private double price;
	@Column(name="valid_days")
	private int valid_days;
	@Column(name="per_day_cost")
	private double per_day_cost;

	//	Convert to String
	@Override
	public String toString() {
		return "airtelEntity [s_no=" + s_no + ", description=" + description + ", price="
				+ price + ", valid_days=" + valid_days + ", per_day_cost=" + per_day_cost + "]";
	}
	//Getter & Setter
	/**
	 * @return the s_no
	 */
	public int gets_no() {
		return s_no;
	}

	/**
	 * @param s_no the s_no to set
	 */
	public void sets_no(int s_no) {
		this.s_no = s_no;
	}

	/**
	 * @return the network
	 */
//	public String getNetwork() {
//		return network;
//	}
//
//	/**
//	 * @param network the network to set
//	 */
//	public void setNetwork(String network) {
//		this.network = network;
//	}

	/**
	 * @return the description
	 */
	public String getdescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setdescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public double getprice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setprice(double price) {
		this.price = price;
	}

	/**
	 * @return the valid_days
	 */
	public int getvalid_days() {
		return valid_days;
	}

	/**
	 * @param valid_days the valid_days to set
	 */
	public void setvalid_days(int valid_days) {
		this.valid_days = valid_days;
	}

	/**
	 * @return the per_day_cost
	 */
	public double getper_day_cost() {
		return per_day_cost;
	}

	/**
	 * @param per_day_cost the per_day_cost to set
	 */
	public void setper_day_cost(double per_day_cost) {
		this.per_day_cost = per_day_cost;
	}
}

