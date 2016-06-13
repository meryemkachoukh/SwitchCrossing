package com.ifsttar.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Crossing implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	private int crossingID;
	private String crossingNO;
	private String code;
	private String absPos;
	private String absPosOffset;
	private float length;
	private String crossingType;
	private float angle;


	/**
	 * @param crossingID
	 * @param crossingNO
	 * @param code
	 * @param absPos
	 * @param absPosOffset
	 * @param length
	 * @param crossingType
	 * @param angle
	 */
	
	
	
	public Crossing(int crossingID, String crossingNO, String code,
			String absPos, String absPosOffset, float length,
			String crossingType, float angle) {
		super();
		this.crossingID = crossingID;
		this.crossingNO = crossingNO;
		this.code = code;
		this.absPos = absPos;
		this.absPosOffset = absPosOffset;
		this.length = length;
		this.crossingType = crossingType;
		this.angle = angle;
	}

	/**
	 * 
	 */
	public Crossing() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCrossingID() {
		return crossingID;
	}

	public void setCrossingID(int crossingID) {
		this.crossingID = crossingID;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCrossingNO() {
		return crossingNO;
	}

	public void setCrossingNO(String crossingNO) {
		this.crossingNO = crossingNO;
	}

	public String getAbsPos() {
		return absPos;
	}

	public void setAbsPos(String absPos) {
		this.absPos = absPos;
	}

	public String getAbsPosOffset() {
		return absPosOffset;
	}

	public void setAbsPosOffset(String absPosOffset) {
		this.absPosOffset = absPosOffset;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public String getCrossingType() {
		return crossingType;
	}

	public void setCrossingType(String crossingType) {
		this.crossingType = crossingType;
	}

	public float getAngle() {
		return angle;
	}

	public void setAngle(float angle) {
		this.angle = angle;
	}
}
