package com.ohgiraffers.section01.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forward")
public class ReceiveInformationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      String userId = req.getParameter("userId");
      String password = req.getParameter("password");

        System.out.println("userId = " + userId);
        System.out.println("password = " + password);

        req.setAttribute("userId", userId);

        /* 필기.
        *   /print url 가진 서블릿 호출해야 함.
        *   RequestDispatcher
        *   - 서블릿을 호출하기 위한 방향 정보를 가진 객체
        * */

        RequestDispatcher rd = req.getRequestDispatcher("print");

        rd.forward(req, resp);

    }
}
