package com.ifsttar.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.crypto.Data;

@Entity
public class Junction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int jonctionId;
	private Date  dateInstall; 
	private String sleepertype;
	private String railtype;
	private String tracktype;
	private List<Maintenance> maintenances;
	private List<Accessoire> accessoires; 

	

	/**
	 * 
	 */
	public Junction() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getJonctionId() {
		return jonctionId;
	}

	/**
	 * @param jonctionId
	 *            the jonctionId to set
	 */
	public void setJonctionId(int jonctionId) {
		this.jonctionId = jonctionId;
	}



	/**
	 * @return the sleepertype
	 */
	public String getSleepertype() {
		return sleepertype;
	}

	/**
	 * @param sleepertype
	 *            the sleepertype to set
	 */
	public void setSleepertype(String sleepertype) {
		this.sleepertype = sleepertype;
	}

	/**
	 * @return the railtype
	 */
	public String getRailtype() {
		return railtype;
	}

	/**
	 * @param railtype
	 *            the railtype to set
	 */
	public void setRailtype(String railtype) {
		this.railtype = railtype;
	}

	/**
	 * @return the tracktype
	 */
	public String getTracktype() {
		return tracktype;
	}

	/**
	 * @param tracktype
	 *            the tracktype to set
	 */
	public void setTracktype(String tracktype) {
		this.tracktype = tracktype;
	}

	public Date getDateInstall() {
		return dateInstall;
	}

	public void setDateInstall(Date dateInstall) {
		this.dateInstall = dateInstall;
	}
	@OneToMany(mappedBy = "junction", cascade = { CascadeType.PERSIST,
            CascadeType.MERGE, CascadeType.REFRESH })
	public List<Maintenance> getMaintenance() {
		return maintenances;
	}

	public void setMaintenance(List<Maintenance> maintenances) {
		this.maintenances = maintenances;
	}

	/**
	 * @return the accessoires
	 */
	@OneToMany(mappedBy = "junction", cascade = { CascadeType.PERSIST,
            CascadeType.MERGE, CascadeType.REFRESH })
	public List<Accessoire> getAccessoires() {
		return accessoires;
	}

	/**
	 * @param accessoires the accessoires to set
	 */
	public void setAccessoires(List<Accessoire> accessoires) {
		this.accessoires = accessoires;
	}

	/**
	 * @return the acce
	 */


	
	 

}
