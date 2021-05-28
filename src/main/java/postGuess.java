import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/guess")
public class postGuess extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userGuess = request.getParameter("userGuess");
        request.setAttribute("userGuess", userGuess);

        request.getRequestDispatcher("/guess_Controller.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userGuess = request.getParameter("userGuess");
        request.setAttribute("userGuess", userGuess);

        request.getRequestDispatcher("/guess_Controller.jsp").forward(request, response);
    }



}
