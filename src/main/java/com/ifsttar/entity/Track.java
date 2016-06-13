package com.ifsttar.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Entity
public class Track implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int trackID; 
	private String trackNO;  
	private String pointdep; 
	private String pointarriv;
	private Station station;
	
	
	
	/**
	 * 
	 */
	public Track() {
		super();
	}
	public Track(int trackID, String trackNO, String pointdep, String pointarriv) {
		super();
		this.trackID = trackID;
		this.trackNO = trackNO;
		this.pointdep = pointdep;
		this.pointarriv = pointarriv;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getTrackID() {
		return trackID;
	}
	public void setTrackID(int trackID) {
		this.trackID = trackID;
	}
	public String getTrackNO() {
		return trackNO;
	}
	public void setTrackNO(String trackNO) {
		this.trackNO = trackNO;
	}
	public String getPointdep() {
		return pointdep;
	}
	public void setPointdep(String pointdep) {
		this.pointdep = pointdep;
	}
	public String getPointarriv() {
		return pointarriv;
	}
	public void setPointarriv(String pointarriv) {
		this.pointarriv = pointarriv;
	}
	/**
	 * @return the station
	 */
	 @JoinColumn(name = "station_FK", insertable = false, updatable = false)
	 @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE,
	 CascadeType.REFRESH }) 
	public Station getStation() {
		return station;
	}
	/**
	 * @param station the station to set
	 */
	public void setStation(Station station) {
		this.station = station;
	} 
	
	
	
	
}
