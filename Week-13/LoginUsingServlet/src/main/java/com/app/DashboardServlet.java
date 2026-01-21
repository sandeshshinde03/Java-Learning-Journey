package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession(false);
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	
	// Session check
    if (session == null || session.getAttribute("email") == null) {
        resp.sendRedirect("login.html");
        return;
    }

    String email = session.getAttribute("email").toString();

    // Minimal HTML output
    out.println("<html><body>");
    out.println("<h2>Welcome " + email + "</h2>");
    out.println("<p>You have successfully logged in.</p>");
    out.println("<a href='logout'>Logout</a>");
    out.println("</body></html>");
}
}
