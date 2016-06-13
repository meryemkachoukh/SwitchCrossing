package com.ifsttar.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Switch_Motor implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int switchmotorID; 
	private String switchmotorNO; 
	private String capacite;
	private Switcht switcht; 

	
	/**
	 * 
	 */
	public Switch_Motor() {
		super();
	}
	public Switch_Motor(int switchmotorID, String switchmotorNO, String capacite) {
		super();
		this.switchmotorID = switchmotorID;
		this.switchmotorNO = switchmotorNO;
		this.capacite = capacite;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getSwitchmotorID() {
		return switchmotorID;
	}
	public void setSwitchmotorID(int switchmotorID) {
		this.switchmotorID = switchmotorID;
	}
	public String getSwitchmotorNO() {
		return switchmotorNO;
	}
	public void setSwitchmotorNO(String switchmotorNO) {
		this.switchmotorNO = switchmotorNO;
	}
	public String getCapacite() {
		return capacite;
	}
	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}
	/**
	 * @return the switcht
	 */
	 @JoinColumn(name = "switch_FK", insertable = false, updatable = false)
	 @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE,
	 CascadeType.REFRESH })
	public Switcht getSwitcht() {
		return switcht;
	}
	/**
	 * @param switcht the switcht to set
	 */
	public void setSwitcht(Switcht switcht) {
		this.switcht = switcht;
	}
	
	
	
	
	
}
