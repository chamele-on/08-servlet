package com.ohgiraffers.section01.servicemethod;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/request-service")
public class ServiceMethodTestServlet extends HttpServlet {

 @Override
 public void service(ServletRequest req, ServletResponse) throws Servlet

     HttpServletRequest httpRequest = (HttpServletRequest) req;
     HttopServletResponse httpRespose = (HttpServletResponse) res;

    // 필기. httpRequest 의 getMethod() method 는 어떠한 http




@override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException
}


/* 필기.
* GET, POST
* -
* */