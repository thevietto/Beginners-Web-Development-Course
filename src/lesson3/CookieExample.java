package lesson3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by root on 21.04.16.
 */
@WebServlet(name = "CookieExample", urlPatterns = "/lesson3/cookies")
public class CookieExample extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cName = request.getParameter("cName");
        String cValue = request.getParameter("cValue");

        Cookie cookie = new Cookie(cName, cValue);
        cookie.setMaxAge(15);
        response.addCookie(cookie);

        response.sendRedirect("/lesson3/cookies");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/lesson3/cookie.jsp").forward(request, response);

    }
}
