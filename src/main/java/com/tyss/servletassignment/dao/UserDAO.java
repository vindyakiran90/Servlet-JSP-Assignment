package com.tyss.servletassignment.dao;

import java.util.List;

import com.tyss.servletassignment.dto.UserBean;

public interface UserDAO {
	UserBean login(String email, String password);
	boolean update(UserBean info, int id);
	boolean delete(int id);
	boolean create(UserBean info);
	List<UserBean> getAllInfoOfUser();
}
