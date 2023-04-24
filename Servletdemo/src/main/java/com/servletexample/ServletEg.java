package com.servletexample;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletEg implements Servlet {
    ServletConfig conf;

    public void init(ServletConfig conf){
        this.conf = conf;
        System.out.println("Creating object ");
    }
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        System.out.println("I am servicing ");
        //creating dynamic response
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1> this output is genereted from servler </h1>");
    }

    public void destroy(){
        System.out.println("I am destroying ");
    }

    public  ServletConfig getServletConfig(){
        return this.conf;
    }

    public String getServletInfo(){
        return "This is info of servlet ";
    }
}
