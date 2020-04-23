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

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null) {
			Object object = session.getAttribute("bean");
			UserBean bean = (UserBean) object;
			int id = Integer.parseInt(req.getParameter("id"));
			bean.setPassword(req.getParameter("password"));

			UserDAO dao = UserDAOFactory.getDAOFactory();
			dao.update(bean, id);
			
			req.getRequestDispatcher("home").forward(req, resp);
		} else {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
