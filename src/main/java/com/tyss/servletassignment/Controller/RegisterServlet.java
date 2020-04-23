package com.tyss.servletassignment.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.servletassignment.dao.UserDAO;
import com.tyss.servletassignment.dto.UserBean;
import com.tyss.servletassignment.factory.UserDAOFactory;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String country = req.getParameter("country");
		String sex = req.getParameter("sex");
		
		UserBean bean = new UserBean();
		bean.setId(id);
		bean.setName(name);
		bean.setEmail(email);
		bean.setPassword(password);
		bean.setCountry(country);
		bean.setSex(sex);
		
		UserDAO dao = UserDAOFactory.getDAOFactory();
		boolean check = dao.create(bean);
		if(check) {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("userForm.jsp").forward(req, resp);
		}
	}
}
