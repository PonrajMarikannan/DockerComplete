package com.raj.crime.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Criminal")
public class Criminal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dob")
	private String dob;
	
	@ManyToOne(targetEntity = CrimeCase.class)
	 @JoinColumn(name="cid")
	
	 private CrimeCase crimecase;

	public int getId() {
		return id;
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

	public CrimeCase getCrimecase() {
		return crimecase;
	}

	public void setCrimecase(CrimeCase crimecase) {
		this.crimecase = crimecase;
	}

	public Criminal(int id, String name, String dob, CrimeCase crimecase) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.crimecase = crimecase;
	}

	public Criminal() {
		super();
	}

	@Override
	public String toString() {
		return "Criminal [id=" + id + ", name=" + name + ", dob=" + dob + ", crimecase=" + crimecase + "]";
	}

	
}