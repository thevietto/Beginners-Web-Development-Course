import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.IntStream;

@WebServlet(urlPatterns = "/practice")
public class PracticeServlet extends HttpServlet {

    String[] names = {"Max", "Alice", "Bob"};

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();
        String sortBy = req.getParameter("sortBy");
        if (sortBy != null) {
            switch (sortBy) {
                case "alphabetical":
                    Arrays.sort(names, String::compareTo);
                    break;
                case "length":
                    Arrays.sort(names, (o1, o2) -> o1.length() - o2.length());
            }
        }
        writer.write("<a href=\"?sortBy=alphabetical\">Сортировать по алфавиту</a><br>");
        writer.write("<a href=\"?sortBy=length\">Сортировать по длине</a><br>");

        IntStream.range(0, names.length).forEach(value -> writer.print(value + ". " + names[value] + "\n"));
        writer.close();
    }
}
