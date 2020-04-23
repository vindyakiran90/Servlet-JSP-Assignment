package com.tyss.servletassignment.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.servletassignment.dao.UserDAO;
import com.tyss.servletassignment.dto.UserBean;
import com.tyss.servletassignment.factory.UserDAOFactory;
@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null) {

			UserDAO dao = UserDAOFactory.getDAOFactory();
			List<UserBean> beans = dao.getAllInfoOfUser();
			req.setAttribute("beans", beans);

			req.getRequestDispatcher("viewusers.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}

	}
}
