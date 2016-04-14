package lesson2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/lesson2/jstl")
public class JstlExample extends HttpServlet {

    List<String> list = new ArrayList<>();

    public JstlExample() {
//        list.add("First message");
//        list.add("Second message");
//        list.add("Third message");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("messageList", list);
        getServletContext().getRequestDispatcher("/lesson2/jstl.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        list.add(req.getParameter("message"));

        req.setAttribute("messageList", list);
        getServletContext().getRequestDispatcher("/lesson2/jstl.jsp").forward(req, resp);
    }
}
