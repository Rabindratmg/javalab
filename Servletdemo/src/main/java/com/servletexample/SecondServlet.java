package com.servletexample;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends GenericServlet {
    public void init(ServletConfig conf){}
    public void service(ServletRequest request, ServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html/jsp");
        PrintWriter out = response.getWriter();
        out.println("<h1> this is html page generated from sevlet </h1>");
    }

    public void destroy(){}
}
