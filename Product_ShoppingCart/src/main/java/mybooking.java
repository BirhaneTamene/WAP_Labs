import Model.DAO;
import Model.ticket;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mybooking")
public class mybooking extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession ses= req.getSession();
        List<ticket> mybooking=new ArrayList<>();
        if(ses.getAttribute("user")!=null){
DAO data= (DAO) ses.getAttribute("doa");
            for (ticket t:data.getTicketdata() ){
                if(t.getUser().equals(ses.getAttribute("user"))){

           mybooking.add(t);
        }
            }
            ses.setAttribute("mybooking",mybooking);
            RequestDispatcher dispatcher= req.getRequestDispatcher("WEB-INF/mybooking.jsp");
            dispatcher.forward(req,resp);
        }
        else
        {
            RequestDispatcher dispatcher= req.getRequestDispatcher("/register");
            dispatcher.forward(req,resp);
        }

    }
}
