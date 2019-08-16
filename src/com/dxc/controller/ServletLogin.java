package com.dxc.controller;

import java.io.Console;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.entity.Person;

import javafx.scene.control.Alert;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private final String username="tai";
	private final String password="123";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ur =request.getParameter("username");
		String passw =request.getParameter("pass");
		if(ur.equalsIgnoreCase("tai") && passw.equalsIgnoreCase("123"))
		{
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(10);
			session.setAttribute("username",ur);
            RequestDispatcher disptcher =request.getRequestDispatcher("Trangchu.jsp");
            disptcher.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		//	https://www.google.com/search?rlz=1C1CHBF_enVN801VN801&ei=ADlVXZz_J8u9rQHopKboCQ&q=timeout+logout++session+servlet&oq=timeout+logout++session+servlet&gs_l=psy-ab.3...10812.13094..13318...0.0..0.70.510.8......0....1..gws-wiz.......0i71j0i30j0i8i30j0i8i7i30.Znmz13BZnMM&ved=0ahUKEwic_6io2oTkAhXLXisKHWiSCZ0Q4dUDCAo&uact=5
			rd.include(request, response);
		}
	}

}
