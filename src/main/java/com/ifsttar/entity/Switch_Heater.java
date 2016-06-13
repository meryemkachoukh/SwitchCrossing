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
public class Switch_Heater implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int switchheaterID; 
	private String caracteristique; 
	private String modele;
	private Switcht switcht;
	
	
	
	/**
	 * 
	 */
	public Switch_Heater() {
		super();
	}
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getSwitchheaterID() {
		return switchheaterID;
	}
	public void setSwitchheaterID(int switchheaterID) {
		this.switchheaterID = switchheaterID;
	}
	public String getCaracteristique() {
		return caracteristique;
	}
	public void setCaracteristique(String caracteristique) {
		this.caracteristique = caracteristique;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
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
