public class CookieServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException {
        Cookie name = new Cookie("username", "John");
        response.addCookie(name);

        response.getWriter().println("Cookie set: username=John");
    }
}
