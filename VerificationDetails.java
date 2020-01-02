package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class VerificationDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String voterId;
	private String passportNo;
	private String aadharNo;
	private String panNo;
	private String drivingLicenseNo;
	@OneToOne
	@JoinColumn(name = "cit_id")
	private Citizen citizen;
	
	public VerificationDetails() {
		
	}
	
	public VerificationDetails(int id, String voterId, String passportNo, String aadharNo, String panNo,
			String drivingLicenseNo) {
		super();
		this.id = id;
		this.voterId = voterId;
		this.passportNo = passportNo;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
		this.drivingLicenseNo = drivingLicenseNo;
	}
	
	public VerificationDetails(String voterId, String passportNo, String aadharNo, String panNo,
			String drivingLicenseNo) {
		super();
		this.voterId = voterId;
		this.passportNo = passportNo;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
		this.drivingLicenseNo = drivingLicenseNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getDrivingLicenseNo() {
		return drivingLicenseNo;
	}

	public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}

	@Override
	public String toString() {
		return "VerificationDetails [id=" + id + ", voterId=" + voterId + ", passportNo=" + passportNo + ", AadharNo="
				+ aadharNo + ", PanNo=" + panNo + ", DrivingLicenseNo=" + drivingLicenseNo + "]";
	}
	
}
