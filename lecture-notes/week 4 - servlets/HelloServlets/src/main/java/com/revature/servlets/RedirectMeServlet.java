package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectMeServlet extends HttpServlet{
	private static final long serialVersionUID = -8838287962881215962L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("RedirectMeServlet#doGet invoked!");
        resp.sendRedirect("http://localhost:8080/test-app/test");
    }
}
