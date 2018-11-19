import Model.movie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet({"/moviedetails",""})
public class moviedetails  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                HttpSession ses=  req.getSession();
              movie mov= new movie(111,"selina","romance","en","130 sec","kakjlid","sami mn","hghsdf",45.9);
        //ovie mov= new movie(111,"ww","ww","d","d","d","d","d");
                ses.setAttribute("movie",mov);

                    RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/moviedetails.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/moviedetails.jsp");
        dispatcher.forward(req, resp);
    }
}
