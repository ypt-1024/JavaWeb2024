package com.this0.servlet.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author yupengtao
 * @Date 2023/6/30 22:37
 **/
@WebServlet(name = "SessionTest", value = "/SessionTest")
public class SessionTest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        System.out.println("sessionID是：" + session.getId());
        session.setAttribute("username", "张三");
        Object username = session.getAttribute("username");
        System.out.println("你是：" + username);

    }
}
