package com.this0.servlet.LifeCycle;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(name = "TestlifeCycle", value = "/lifeCycle")
public class LifeCycle extends HttpServlet {

    public LifeCycle() {
        System.out.println("正在实例化");
    }
    @Override
    public void init() throws ServletException {
        System.out.println("周期初始化");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) {
        System.out.println("正在服务");
    }

    @Override
    public void destroy() {
        System.out.println("正在销毁");
    }
}

