package com.example.LoginServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        if(username.equals("admin") && password.equals("admin")) {
//            writer.println("<h1>Welcome "+username+" to website</h1>");
            response.sendRedirect("welcome.jsp");
        } else{
            writer.println("<h1>Login Error</h1>");
        }

        writer.println("</html>");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

    }
}