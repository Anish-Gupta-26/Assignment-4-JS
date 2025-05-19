public class SessionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException {
        HttpSession session = request.getSession();
        session.setAttribute("theme", "dark");
        response.getWriter().println("Theme set in session");
    }
