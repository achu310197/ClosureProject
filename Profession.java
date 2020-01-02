package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Profession {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String sector;
	private String deptt;
	@OneToOne
	@JoinColumn(name = "cit_id")
	private Citizen citizen;
	
	public Profession() {
		
	}
	
	public Profession(int id, String sector, String deptt) {
		super();
		this.id = id;
		this.sector = sector;
		this.deptt = deptt;
	}
	
	public Profession(String sector, String deptt) {
		super();
		this.sector = sector;
		this.deptt = deptt;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSector() {
		return sector;
	}
	
	public void setSector(String sector) {
		this.sector = sector;
	}
	
	public String getDeptt() {
		return deptt;
	}
	
	public void setDeptt(String deptt) {
		this.deptt = deptt;
	}
	
	@Override
	public String toString() {
		return "Profession [id=" + id + ", sector=" + sector + ", deptt=" + deptt + "]";
	}
	
}
