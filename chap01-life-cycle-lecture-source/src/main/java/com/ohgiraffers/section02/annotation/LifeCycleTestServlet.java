package com.ohgiraffers.section02.annotation;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

@WebServlet(value = "/annotation-lifecycle")
public class LifeCycleTestServlet extends HttpServlet {


    private int initCount = 1;
    private int serviceCount = 1;
    private int destroyCount = 1;


    public LifeCycleTestServlet() {
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        System.out.println("xml 매핑 service 메소드 호출 : " + serviceCount++);

    }

    @Override
    public void destroy() {

        System.out.println("xml 매핑 destroy() 메소드 호출 : " + destroyCount++);
    }


    @Override
    public void init() throws ServletException {

        System.out.println("xml 매핑 init() 메소드 호출 : " + initCount++);

    }
}