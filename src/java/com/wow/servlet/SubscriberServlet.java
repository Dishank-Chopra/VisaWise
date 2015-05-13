package com.wow.servlet;

import java.io.*; 
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class SubscriberServlet extends HttpServlet { 
    // This method only calls processRequest() 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException 
    { 
        processRequest(request, response);
    }

    // This method only calls processRequest() 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    { 
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
    {
            String a=request.getParameter("email");
    }
        
}