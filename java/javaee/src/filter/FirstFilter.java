package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by dyr on 2016/8/7.
 */
@WebFilter(filterName = "FirstFilter",asyncSupported = true,urlPatterns = {"/filter"},dispatcherTypes = DispatcherType.REQUEST)
public class FirstFilter implements Filter {
    public void destroy() {
        System.out.println("destroy start");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter start!");
        chain.doFilter(req, resp);
        System.out.println("doFilter end!");

    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("init start!");
    }

}
