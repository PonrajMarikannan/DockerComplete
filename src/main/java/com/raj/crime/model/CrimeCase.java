package com.raj.crime.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CrimeCase")
public class CrimeCase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="cid")
	private int cid;
	
	@Column(name="casenumber")
	private int casenumber;
	
	@Column(name="casedescription")
	private String casedescription;
	
	@Column(name="dateoccour")
	private String dateoccour;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getCasenumber() {
		return casenumber;
	}

	public void setCasenumber(int casenumber) {
		this.casenumber = casenumber;
	}

	public String getCasedescription() {
		return casedescription;
	}

	public void setCasedescription(String casedescription) {
		this.casedescription = casedescription;
	}

	public String getDateoccour() {
		return dateoccour;
	}

	public void setDateoccour(String dateoccour) {
		this.dateoccour = dateoccour;
	}

	public CrimeCase() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CrimeCase [cid=" + cid + ", casenumber=" + casenumber + ", casedescription=" + casedescription
				+ ", dateoccour=" + dateoccour + "]";
	}

	public CrimeCase(int cid, int casenumber, String casedescription, String dateoccour) {
		super();
		this.cid = cid;
		this.casenumber = casenumber;
		this.casedescription = casedescription;
		this.dateoccour = dateoccour;
	}

	

	
	
	
	
	
}
	

