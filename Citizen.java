package Model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Citizen {
	@Id
	private int id;
	private String name;
	private String dob;
	private String fatherName;
	private String motherName;
	private String bloodGroup;
	private String password;
	@Embedded
	private Address address;
	
	public Citizen() {
		
	}
	
	public Citizen(int id, String name, String dob, String fatherName, String motherName, String bloodGroup,
			String password, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.bloodGroup = bloodGroup;
		this.password = password;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", dob=" + dob + ", fatherName=" + fatherName + ", motherName="
				+ motherName + ", bloodGroup=" + bloodGroup + ", address=" + address + "]";
	}
	
}
