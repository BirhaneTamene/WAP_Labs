import Model.DAO;
import Model.movie;
import Model.registeruser;
import Model.ticket;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import com.fasterxml.jackson.core.JsonGenerationException;
 import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet("/reviewOrder")
public class revieworder extends HttpServlet {
    //
    ObjectMapper mapper = new ObjectMapper();
    //
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String showdate= req.getParameter("sdate");
        String showtime=req.getParameter("stime");
        String seats= req.getParameter("nseat");
        HttpSession ses= req.getSession();
        registeruser u= (registeruser) ses.getAttribute("user");
        movie movie= (movie) ses.getAttribute("movie"); // or retrieve using movie name
        ticket ticket= new ticket(showdate,showtime,seats);
        ticket.setMovie(movie);
        ticket.setUser(u);
        ses.setAttribute("ticket",ticket);

        DAO data= new DAO();
        data.getTicketdata().add(ticket);
       ses.setAttribute("doa",data);
            String jsonSting = req.getParameter("ticket");
        PrintWriter out =resp.getWriter();
        try{
            ticket ticketdata = mapper.readValue(jsonSting, ticket.class);
            ticketdata.setUser(u);
           ticketdata.setMovie(movie);
            //out.print("Test succesful");
            out.print(mapper.writeValueAsString(ticketdata));
        }catch (JsonGenerationException e) {
            e.printStackTrace();
        }
//        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/reviewOrder.jsp");
//        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("/payment");
        dispatcher.forward(req, resp);
    }
}
