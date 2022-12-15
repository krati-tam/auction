package model;



public class Seller {
	
	private String firstName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String lastName;
	private String  address;
	private String city; 
	private String state;
	private int pin;
	private int phone;
    private String email;
	
	
	



public Seller() {
	super();

/*public Seller(int id, 
	@NotNull(message=" first name may not be Null")@Length(min =5,max=30) @Length(min =3,max=25)
@NotNull(message="last name may not be Null") String address,String city,String state,String pin,
@NotNull(message="Phone number may not be Null")@Length(min =10,max=10) Long phone, @Email(regexp ="[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z],{2,3}")
@NotNull(message="Email may not be Null"));


this.id=id;
this.firstName=firstName;
this.lastName=lastName;
this.address=address;
this.city=city;
this.state=state;
this.pin=pin;
this.phone=phone;
this.email=email;*/      
}
}

