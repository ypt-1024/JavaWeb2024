package com.this0.servlet.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


@WebServlet(name = "ServletB", value = "/servletB")
public class ServletContextTest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 从ServletContext中获取为所有的Servlet准备的参数
        ServletContext servletContext = this.getServletContext();
        String valueA = servletContext.getInitParameter("paramA");
        System.out.println("paramA:" + valueA);
        // 获取所有参数名
        Enumeration<String> initParameterNames = servletContext.getInitParameterNames();
        // 迭代并获取参数名
        while (initParameterNames.hasMoreElements()) {
            String paramaterName = initParameterNames.nextElement();
            System.out.println(paramaterName + ":" + servletContext.getInitParameter(paramaterName));
        }
    }
}
