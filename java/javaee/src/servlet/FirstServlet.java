package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dyr on 2016/8/6.
 */
@WebServlet(urlPatterns = {"/hello"},asyncSupported = true)
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("hello world!");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("hello worldgdd!");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init");
        String username=this.getInitParameter("username");

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }
}
