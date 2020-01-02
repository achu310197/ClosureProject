package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BankDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String accountNo;
	private String ifsc;
	private String bankName;
	private String city;
	private String state;
	@OneToOne
	@JoinColumn(name = "cit_id")
	private Citizen citizen;
	
	public BankDetails() {
		
	}
	
	public BankDetails(int id, String accountNo, String ifsc, String bankName, String city, String state) {
		super();
		this.id = id;
		this.accountNo = accountNo;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.city = city;
		this.state = state;
	}
	
	public BankDetails(String accountNo, String ifsc, String bankName, String city, String state) {
		super();
		this.accountNo = accountNo;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.city = city;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
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

	@Override
	public String toString() {
		return "BankDetails [id=" + id + ", accountNo=" + accountNo + ", ifsc=" + ifsc + ", bankName=" + bankName
				+ ", city=" + city + ", state=" + state + "]";
	}
	
}
