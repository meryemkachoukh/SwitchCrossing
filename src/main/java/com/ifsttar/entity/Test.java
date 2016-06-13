/**
 * 
 */
package com.ifsttar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Asus
 *
 */
@Entity
public class Test {
	private int id;

	/**
	 * @return the id
	 */
	@Id
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	} 

}
