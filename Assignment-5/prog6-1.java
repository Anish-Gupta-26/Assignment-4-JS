public class LoggingFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
    throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        System.out.println("Request from: " + request.getRemoteAddr());
        chain.doFilter(req, res);
    }
}
