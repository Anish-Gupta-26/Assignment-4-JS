public class ConfigServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException {
        PrintWriter out = response.getWriter();

        // Using ServletConfig
        ServletConfig config = getServletConfig();
        String dbUser = config.getInitParameter("dbUser");

        // Using ServletContext
        ServletContext context = getServletContext();
        context.setAttribute("appName", "My Web App");

        out.println("Database User: " + dbUser);
        out.println("<br>App Name: " + context.getAttribute("appName"));
    }
}
