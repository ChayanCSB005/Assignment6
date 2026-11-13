package com.student;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");

        String roll = request.getParameter("roll");

        request.setAttribute("studentName", name);

        request.setAttribute("studentRoll", roll);

        request.getRequestDispatcher("result.jsp")
               .forward(request, response);
    }
}