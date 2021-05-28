import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/incorrect")
public class lossServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lose = request.getParameter("lose");

        request.setAttribute("lose", "You Lost! :(");
        request.getRequestDispatcher("/outcomeViewer.jsp").forward(request, response);
    }
}