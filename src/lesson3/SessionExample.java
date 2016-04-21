package lesson3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 21.04.16.
 */
@WebServlet(name = "SessionExample", urlPatterns = "/lesson3/sessions")
public class SessionExample extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        session.setMaxInactiveInterval(20);
        String sName = request.getParameter("sName");
        String sValue = request.getParameter("sValue");

        Map<String, String> map = (Map<String, String>) session.getAttribute("map");
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(sName, sValue);
        session.setAttribute("map", map);
        response.sendRedirect("/lesson3/sessions");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        request.setAttribute("sessionCreated", new Date(session.getCreationTime()));
        getServletContext().getRequestDispatcher("/lesson3/sessions.jsp").forward(request, response);
    }
}
