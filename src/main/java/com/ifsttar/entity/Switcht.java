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
@Entity
public class Switcht implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int switchID; 
	private String switchNO;
	private Date installation;
	private String code; 
	private float absPos; 
	private float length;
	private float grad; 
	private float rad; 
	private String joints;
	private String type_stwitch;
	private String points; 
	private String heel;
	private List<Position_Detector> posDetectors;
	private List<Switch_Heater> switchHeaters;
	private List<Switch_Motor> switchMotors;
	private List<Switch_Roller> switchRoller;
	
	
	
	
	/**
	 * 
	 */
	public Switcht() {
		super();
	}

	public Switcht(int switchID, String switchNO, Date installation,
			String code, float absPos, float length, float grad, float rad,
			String joints, String type_stwitch, String points, String heel) {
		super();
		this.switchID = switchID;
		this.switchNO = switchNO;
		this.installation = installation;
		this.code = code;
		this.absPos = absPos;
		this.length = length;
		this.grad = grad;
		this.rad = rad;
		this.joints = joints;
		this.type_stwitch = type_stwitch;
		this.points = points;
		this.heel = heel;
	}

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getSwitchID() {
		return switchID;
	}


	public void setSwitchID(int switchID) {
		this.switchID = switchID;
	}


	public String getSwitchNO() {
		return switchNO;
	}


	public void setSwitchNO(String switchNO) {
		this.switchNO = switchNO;
	}


	public Date getInstallation() {
		return installation;
	}


	public void setInstallation(Date installation) {
		this.installation = installation;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public float getAbsPos() {
		return absPos;
	}


	public void setAbsPos(float absPos) {
		this.absPos = absPos;
	}


	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


	public float getGrad() {
		return grad;
	}


	public void setGrad(float grad) {
		this.grad = grad;
	}


	public float getRad() {
		return rad;
	}


	public void setRad(float rad) {
		this.rad = rad;
	}


	public String getJoints() {
		return joints;
	}


	public void setJoints(String joints) {
		this.joints = joints;
	}


	public String getType_stwitch() {
		return type_stwitch;
	}


	public void setType_stwitch(String type_stwitch) {
		this.type_stwitch = type_stwitch;
	}


	public String getPoints() {
		return points;
	}


	public void setPoints(String points) {
		this.points = points;
	}


	public String getHeel() {
		return heel;
	}


	public void setHeel(String heel) {
		this.heel = heel;
	}


	/**
	 * @return the posDetectors
	 */
	@OneToMany(mappedBy="switcht",cascade = { CascadeType.PERSIST,
    CascadeType.MERGE, CascadeType.REFRESH })
	public List<Position_Detector> getPosDetectors() {
		return posDetectors;
	}


	/**
	 * @param posDetectors the posDetectors to set
	 */
	public void setPosDetectors(List<Position_Detector> posDetectors) {
		this.posDetectors = posDetectors;
	}

	/**
	 * @return the switchHeaters
	 */
	@OneToMany(mappedBy="switcht",cascade = { CascadeType.PERSIST,
		    CascadeType.MERGE, CascadeType.REFRESH })
	public List<Switch_Heater> getSwitchHeaters() {
		return switchHeaters;
	}

	/**
	 * @param switchHeaters the switchHeaters to set
	 */
	public void setSwitchHeaters(List<Switch_Heater> switchHeaters) {
		this.switchHeaters = switchHeaters;
	}

	/**
	 * @return the switchMotors
	 */
  @OneToMany(mappedBy="switcht",cascade = { CascadeType.PERSIST,
		    CascadeType.MERGE, CascadeType.REFRESH })
	public List<Switch_Motor> getSwitchMotors() {
		return switchMotors;
	}

	/**
	 * @param switchMotors the switchMotors to set
	 */
	public void setSwitchMotors(List<Switch_Motor> switchMotors) {
		this.switchMotors = switchMotors;
	}

	/**
	 * @return the switchRoller
	 */
	@OneToMany(mappedBy="switcht",cascade = { CascadeType.PERSIST,
		    CascadeType.MERGE, CascadeType.REFRESH })
	public List<Switch_Roller> getSwitchRoller() {
		return switchRoller;
	}

	/**
	 * @param switchRoller the switchRoller to set
	 */
	public void setSwitchRoller(List<Switch_Roller> switchRoller) {
		this.switchRoller = switchRoller;
	} 
	
	
	
	
	
	
}
