package lesson1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("I AM CREATED");
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();
        out.println("<h1>Hello мир!</h1>");

        out.println(req.getRemoteAddr() + "<br>");
        out.println(req.getHeader("User-Agent"));

        out.close();
    }

    @Override
    public void destroy() {
        System.out.println("I AM DESTROYED!");
        super.destroy();
    }
}
