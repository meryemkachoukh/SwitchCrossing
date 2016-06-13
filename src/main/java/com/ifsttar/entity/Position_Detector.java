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
public class Position_Detector implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int PositionID; 
	private String posDetecNO; 
	private float pos;
   private Switcht switcht;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getPositionID() {
		return PositionID;
	}
	
	
	
	/**
	 * 
	 */
	public Position_Detector() {
		super();
	}

	public Position_Detector(int positionID, String posDetecNO, float pos) {
		super();
		PositionID = positionID;
		this.posDetecNO = posDetecNO;
		this.pos = pos;
	}
	
	public void setPositionID(int positionID) {
		PositionID = positionID;
	}
	public String getPosDetecNO() {
		return posDetecNO;
	}
	public void setPosDetecNO(String posDetecNO) {
		this.posDetecNO = posDetecNO;
	}
	public float getPo() {
		return pos;
	}
	public void setPo(float pos) {
		this.pos = pos;
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
