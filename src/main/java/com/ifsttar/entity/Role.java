/**
 * 
 */
package com.ifsttar.entity;

import java.io.Serializable;
import java.util.List;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Asus
 *
 */
@Entity
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idRole;
	private String typeRole;
	private List<User> users;

	/**
	 * @return the users
	 */
	@OneToMany(mappedBy = "role", cascade = { CascadeType.PERSIST,
			CascadeType.REMOVE, CascadeType.MERGE })
	public List<User> getUsers() {
		return users;
	}

	/**
	 * @param users
	 *            the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}

	/**
	 * @return the idRole
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdRole() {
		return idRole;
	}

	/**
	 * @param idRole
	 *            the idRole to set
	 */
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	/**
	 * @return the typeRole
	 */
	public String getTypeRole() {
		return typeRole;
	}

	/**
	 * @param typeRole
	 *            the typeRole to set
	 */
	public void setTypeRole(String typeRole) {
		this.typeRole = typeRole;
	}

}
