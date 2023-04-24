package com.servletexample;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletExampleHttp extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException
    {
        res.setContentType("html/jsp/text");
        PrintWriter out = res.getWriter();
        out.println("This is page");
    }
}
