package com.ifsttar.services;

import java.util.List;

import javax.ejb.Remote;

import com.ifsttar.entity.User;

@Remote
public interface UserManagementRemote {

	/**
	 * create user
	 * 
	 * @param simpleUser
	 */
	void createUser(User simpleUser);

	/**
	 * delete user
	 * 
	 * @param simpleUser
	 */
	void deleteUser(User simpleUser);

	/**
	 * all user
	 * 
	 * @return list user
	 */
	List<User> getAllUsers();

	/**
	 * update user
	 * 
	 * @param simpleUser
	 */
	void updateUser(User simpleUser);

	/**
	 * verification login and password
	 * 
	 * @param login
	 * @param password
	 * @return user
	 */
	User verifWithLogin(String login, String password);

}
