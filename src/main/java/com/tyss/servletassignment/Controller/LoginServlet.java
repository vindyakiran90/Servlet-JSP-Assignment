package com.tyss.servletassignment.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.servletassignment.dao.UserDAO;
import com.tyss.servletassignment.dto.UserBean;
import com.tyss.servletassignment.factory.UserDAOFactory;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		UserDAO dao = UserDAOFactory.getDAOFactory();
		UserBean bean = dao.login(email, password);
		
		if(bean == null) {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		} else {
			HttpSession session = req.getSession(true);
			session.setAttribute("bean", bean);
			req.getRequestDispatcher("home").forward(req, resp);
		}
		
	}
}

