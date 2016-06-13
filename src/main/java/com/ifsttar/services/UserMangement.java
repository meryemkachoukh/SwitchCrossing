package com.ifsttar.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ifsttar.entity.User;

@Stateless
public class UserMangement implements UserManagementRemote {

	@PersistenceContext(name="NetIRail")
	private EntityManager em;

	@Override
	public void createUser(User simpleUser) {
		em.persist(simpleUser);
	}

	@Override
	public void deleteUser(User simpleUser) {
		try {

			String userQuery = "DELETE FROM User c WHERE idUser =:id";
			Query query = em.createQuery(userQuery);
			query.setParameter("id", simpleUser.getIdUser());
			query.executeUpdate();
		} catch (Exception e) {
		}
	}

	@Override
	public List<User> getAllUsers() {
		Query query = em.createQuery("select e from User e");
		return query.getResultList();
	}

	public void updateUser(User simpleUser) {
		
	}

	@Override
	public User verifWithLogin(String login, String password) {
		User user = null;

		try {
			String userQuery = "select u from User u where (upper(login) = upper(:login)) and (upper(password) = upper(:password)) ";
			Query query = em.createQuery(userQuery);
			query.setParameter("login", login);
			query.setParameter("password", password);

			try {
				user = (User) query.getSingleResult();

			} catch (Exception ex) {
			}

		} catch (Exception ex) {

		}
		return user;
	}

}
