package lesson4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ainurminibaev on 28.04.16.
 */
@WebServlet(urlPatterns = "/lesson4/js")
public class JsTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ("redirect".equals(req.getHeader("X-Google"))) {
            resp.sendRedirect("http://google.com");
            return;
        }
        getServletContext().getRequestDispatcher("/lesson4/l4.jsp").forward(req, resp);
    }
}
