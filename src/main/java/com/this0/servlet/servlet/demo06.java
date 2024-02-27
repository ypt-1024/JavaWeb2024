package com.this0.servlet.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author yupengtao
 * @Date 2023/7/1 22:22
 **/
@WebServlet("/demo06")
public class demo06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext application = req.getServletContext();
        Object uname = application.getAttribute("uname");
        System.out.println("uname = " + uname);
    }
}
