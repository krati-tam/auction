package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.sun.istack.NotNull;

@Entity
@Table(name="Buyer")
public class Buyer {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO )
	private int id;
	@NotNull(message="first name may not be Null")
	@Length(min =5,max=30)
	private String firstName;
	@Length(min =3,max=25)
	@NotNull(message="last name may not be Null")
	private String lastName;
	
	private String address;
	private String city; 
	private String state;
	private int pin;
	
	@Length(min =10,max=10)
	@NotNull(message="Phone number may not be Null")
    private long phone;
	
	@Email(regexp ="[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z],{2,3}")
	@NotNull(message="Email may not be Null")
	private String email;
	
	//@OneToOne(fetch=jakarta.persistence.fetchType.EAGER)
	private Product productId;
	private int bidAmount;
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getstate() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getpin() {
		return pin;
	}
	public void setpin(int pin) {
		this.pin = pin;
	}
	public long getphone() {
		return phone;
	}
	public void setphone(int phone) {
		this.phone = phone;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public Product getproductId() {
		return productId;
	}
	public void setproductId(Product productId) {
		this.productId = productId;
	}
	public int getBidAmount() {
		return bidAmount;
	}
	public void setBid_amount(int bidAmount) {
		this.bidAmount = bidAmount;
	}
	public Object getProduct() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setBidAmount(int amount) {
		// TODO Auto-generated method stub
		
	}
	

}

