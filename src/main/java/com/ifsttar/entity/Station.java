package com.ifsttar.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.List;
import java.util.Set;

@Entity
public class Station implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int stationID;
	private String nom;
	private int nbr_track;
	
	
	private Region region;
	private List<Track> traks;

	
	
	
	/**
	 * 
	 */
	public Station() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getStationID() {
		return stationID;
	}

	public void setStationID(int stationID) {
		this.stationID = stationID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbr_track() {
		return nbr_track;
	}

	public void setNbr_track(int nbr_track) {
		this.nbr_track = nbr_track;
	}

	/**
	 * @return the region
	 */
	 @JoinColumn(name = "region_FK", insertable = false, updatable = false)
	 @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE,
	 CascadeType.REFRESH })
	public Region getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}



	/**
	 * @param traks the traks to set
	 */
	public void setTraks(List<Track> traks) {
		this.traks = traks;
	}

	
	/**
	 * @return the traks
	 */
	  @OneToMany(mappedBy = "station", cascade = { CascadeType.PERSIST,
	            CascadeType.MERGE, CascadeType.REFRESH })
	public List<Track> getTraks() {
		return traks;
	}

	/**
	 * @param traks the traks to set
	 */
	

}
