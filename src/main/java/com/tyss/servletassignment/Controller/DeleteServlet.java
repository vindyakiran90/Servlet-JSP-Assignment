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

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);

		if(session == null) {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		} else {
			int id = Integer.parseInt(req.getParameter("id")); 
			UserDAO dao = UserDAOFactory.getDAOFactory(); 
			dao.delete(id);

			resp.sendRedirect("home.jsp");
		} 
	}
}
