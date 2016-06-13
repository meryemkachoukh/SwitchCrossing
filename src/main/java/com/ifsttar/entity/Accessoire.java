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
public class Accessoire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accessoireID;
	private String typAc;
	private String modele;
	private Junction junction;
	

	/**
	 * @param accessoireID
	 * @param typAc
	 * @param modele
	 */
	public Accessoire(int accessoireID, String typAc, String modele) {
		super();
		this.accessoireID = accessoireID;
		this.typAc = typAc;
		this.modele = modele;
	}

	/**
	 * 
	 */
	public Accessoire() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getAccessoireID() {
		return accessoireID;
	}

	public void setAccessoireID(int accessoireID) {
		this.accessoireID = accessoireID;
	}

	public String getTypAc() {
		return typAc;
	}

	public void setTypAc(String typAc) {
		this.typAc = typAc;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	/**
	 * @return the junction
	 */
	@JoinColumn(name = "junction_FK", insertable = false, updatable = false)
	 @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE,
	 CascadeType.REFRESH })
	public Junction getJunction() {
		return junction;
	}

	/**
	 * @param junction the junction to set
	 */
	public void setJunction(Junction junction) {
		this.junction = junction;
	}
	
	
	
	 

}
