package com.example.demo;  
  
import java.io.IOException;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
@WebServlet("/loginServlet")  
public class LoginServlet extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        String username = request.getParameter("username");  
        String gender = request.getParameter("gender");  
  
        if (username == null || username.trim().isEmpty()) {  
            response.sendRedirect("login.jsp?error=usernameRequired");  
        } else if ("male".equals(gender)) {  
            response.sendRedirect("maleWelcome.jsp");  
        } else if ("female".equals(gender)) {  
            response.sendRedirect("femaleWelcome.jsp");  
        }  
    }  
}