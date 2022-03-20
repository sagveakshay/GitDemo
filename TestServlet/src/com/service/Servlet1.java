package com.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add")
public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	int n1 = Integer.parseInt(req.getParameter("num1"));
    	int n2 = Integer.parseInt(req.getParameter("num2"));
    	int k = n1+n2;
    	resp.getWriter().print("k");
    		
    }
    

}
