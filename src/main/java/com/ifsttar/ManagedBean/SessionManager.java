/**
 * 
 */
package com.ifsttar.ManagedBean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.ifsttar.entity.User;
import com.ifsttar.services.UserManagementRemote;

/**
 * @author Meryem 
 *
 */
@ManagedBean
@ViewScoped
public class SessionManager implements Serializable {

	/**
	 * 
	 */
	private String login;
	private String password;
	
	
	@EJB
	UserManagementRemote userRemote;
	private static final long serialVersionUID = 1L;

	public void loginUser() {
		User user = null;

		try {
			user = userRemote.verifWithLogin(login, password);

			if (user != null) {
				if (user.getRole().getTypeRole().equals("ROLE_ADMIN")) {

					FacesContext
							.getCurrentInstance()
							.getApplication()
							.getNavigationHandler()
							.handleNavigation(
									FacesContext.getCurrentInstance(),null,
									"/ajoutswitch.xhtml?faces-redirect=true");
				}

			} else if (user == null) {

				FacesMessage msg = new FacesMessage(
						FacesMessage.SEVERITY_ERROR,
						"Invalid username, email or password", null);
				FacesContext.getCurrentInstance().addMessage(null, msg);

			}

		} catch (Exception e) {

		}

	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	

}
