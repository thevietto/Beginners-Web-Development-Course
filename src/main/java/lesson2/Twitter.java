package lesson2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(urlPatterns = "/lesson2/twitter")
public class Twitter extends HttpServlet {

    List<Tweet> tweets = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("tweets", tweets);
        getServletContext().getRequestDispatcher("/lesson2/tweet.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = req.getParameter("tweet");
        Tweet tweet = new Tweet();
        tweet.setMessage(message);
        tweet.setCreatedAt(new Date());

        tweets.add(tweet);
        tweets.sort((o1, o2) -> o1.getCreatedAt().compareTo(o2.getCreatedAt()));
        req.setAttribute("tweets", tweets);
        getServletContext().getRequestDispatcher("/lesson2/tweet.jsp").forward(req, resp);
    }
}
