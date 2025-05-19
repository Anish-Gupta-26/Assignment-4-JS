import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve query parameter
        String name = request.getParameter("name");

        // Get client info
        String ip = request.getRemoteAddr();
        String userAgent = request.getHeader("User-Agent");

        out.println("<html><body>");
        out.println("<h1>Welcome " + name + "</h1>");
        out.println("<p>Your IP: " + ip + "</p>");
        out.println("<p>User Agent: " + userAgent + "</p>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        doGet(request, response); // Reuse doGet
    }
