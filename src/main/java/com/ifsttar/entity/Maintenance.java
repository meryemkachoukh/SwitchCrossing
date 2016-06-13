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
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Maintenance implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int maintenanceID; 
	private String typeMaintenance; 
	private String materiel;
	private Junction junction;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getMaintenanceID() {
		return maintenanceID;
	}
	public void setMaintenanceID(int maintenanceID) {
		this.maintenanceID = maintenanceID;
	}
	public String getTypeMaintenance() {
		return typeMaintenance;
	}
	public void setTypeMaintenance(String typeMaintenance) {
		this.typeMaintenance = typeMaintenance;
	}
	public String getMateriel() {
		return materiel;
	}
	public void setMateriel(String materiel) {
		this.materiel = materiel;
	}
	/**
	 * @return the junction
	 */
	 @JoinColumn(name = "Junction_FK", insertable = false, updatable = false)
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
