package com.tyss.servletassignment.factory;

import com.tyss.servletassignment.dao.UserDAO;
import com.tyss.servletassignment.dao.UserDAOImplement;

public class UserDAOFactory {
	private UserDAOFactory() {
	
	}
	
	public static UserDAO getDAOFactory() {
		return new UserDAOImplement();
	}
}
