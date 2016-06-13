/**
 * 
 */
package com.ifsttar.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 * @author Asus
 *
 */
@Entity
public class Region implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int regionID; 
	private String nom; 
	private String nom_pays; 
	private String degreMax;
	private float degreMin;
	private List<Station> stations;
	
	
	
	/**
	 * @return the regionID
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getRegionID() {
		return regionID;
	}
	
	/**
	 * 
	 */
	public Region() {
		super();
	}
	/**
	 * @param regionID
	 * @param nom
	 * @param nom_pays
	 * @param degreMax
	 * @param degreMin
	 */
	public Region(int regionID, String nom, String nom_pays, String degreMax,
			float degreMin) {
		super();
		this.regionID = regionID;
		this.nom = nom;
		this.nom_pays = nom_pays;
		this.degreMax = degreMax;
		this.degreMin = degreMin;
	}
	/**
	 * @return the degreMin
	 */
	public float getDegreMin() {
		return degreMin;
	}
	/**
	 * @param degreMin the degreMin to set
	 */
	public void setDegreMin(float degreMin) {
		this.degreMin = degreMin;
	}
	/**
	 * @return the degreMax
	 */
	public String getDegreMax() {
		return degreMax;
	}
	/**
	 * @param degreMax the degreMax to set
	 */
	public void setDegreMax(String degreMax) {
		this.degreMax = degreMax;
	}
	/**
	 * @return the nom_pays
	 */
	public String getNom_pays() {
		return nom_pays;
	}
	/**
	 * @param nom_pays the nom_pays to set
	 */
	public void setNom_pays(String nom_pays) {
		this.nom_pays = nom_pays;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * @param regionID the regionID to set
	 */
	public void setRegionID(int regionID) {
		this.regionID = regionID;
	}

	/**
	 * @param regionID
	 * @param nom
	 * @param nom_pays
	 * @param degreMax
	 * @param degreMin
	 * @param stations
	 */
	public Region(int regionID, String nom, String nom_pays, String degreMax,
			float degreMin, List<Station> stations) {
		super();
		this.regionID = regionID;
		this.nom = nom;
		this.nom_pays = nom_pays;
		this.degreMax = degreMax;
		this.degreMin = degreMin;
		this.stations = stations;
	}

	/**
	 * @return the stations
	 */
	@OneToMany(mappedBy = "region", cascade = { CascadeType.PERSIST,
            CascadeType.MERGE, CascadeType.REFRESH })
	public List<Station> getStations() {
		return stations;
	}

	/**
	 * @param stations the stations to set
	 */
	public void setStations(List<Station> stations) {
		this.stations = stations;
	}


	
	
	
	
}
