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
@WebServlet("/demo05")
public class demo05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext application = req.getServletContext();
        application.setAttribute("uname", "application");
    }
}
