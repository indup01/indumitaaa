import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(urlPatterns={"/patients","/doctors"},loadOnStartup = 1)


public class servlett extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");
    String x = req.getServletPath();
    if (Objects.equals(x, "/patients")){
        resp.getWriter().write("i am a patient");
    }
    if (Objects.equals(x, "/doctors")){
            resp.getWriter().write("i am a doctor");
        }


    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

}
