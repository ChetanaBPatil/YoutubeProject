package com.youtube.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.youtube.entity.YoutubeEmployee;
import com.youtube.service.YoutubeService;
import com.youtube.service.YoutubeServiceInterface;


public class GlobalServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    out.println("<html><body>");
		
		String option=request.getParameter("ac");
		
		if(option.equals("register")) {
			
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String password=request.getParameter("pass");
			String address=request.getParameter("address");
			
			
			YoutubeEmployee ye=new YoutubeEmployee();
			ye.setName(name);
			ye.setEmail(email);
			ye.setPass(password);
			ye.setAddress(address);
			
			
			YoutubeServiceInterface ys=YoutubeService.createServiceObject();
			
			int i=ys.createProfile(ye);
			if(i>0) {
				out.println("profile created");
				
			}
			else {
				out.println("profile not created");
				
			}
			}
	       if(option.equals("login")) {
				
			}
	       if(option.equals("timeline")) {
				
			}
	       out.println("</body></html>");
			
			
		}
		
	}


