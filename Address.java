package Model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String houseNo;
	private String street;
	private String city;
	private String zip;
	private String state;
	private String telNo;
	
	public Address() {
		
	}
	
	public Address(String houseNo, String street, String city, String zip, String state, String telNo) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.state = state;
		this.telNo = telNo;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", zip=" + zip
				+ ", state=" + state + ", telNo=" + telNo + "]";
	}
	
}
