public class URLRewriteServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException {
        String sessionId = "123456";
        response.sendRedirect("nextPage?sessionId=" + sessionId);
    }
}
