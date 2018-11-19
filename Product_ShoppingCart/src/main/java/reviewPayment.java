import Model.paymentinfo;
import Model.registeruser;
import Model.ticket;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Double.parseDouble;

@WebServlet("/reviewPayment")
public class reviewPayment extends HttpServlet {
    ObjectMapper mapper= new ObjectMapper();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String cardno= req.getParameter("cardno");
       String cardname= req.getParameter("cardname");
       String cardtype= req.getParameter("cardtype");
       String month= req.getParameter("month");
       String year= req.getParameter("year");
       String cvvno=req.getParameter("cvvno");
       String amount=req.getParameter("amount");
double amt= parseDouble(amount);
        HttpSession ses= req.getSession();
        registeruser u= (registeruser) ses.getAttribute("user");

paymentinfo pay= new paymentinfo(cardno,cardname,cardtype,month,year,cvvno,amt,u);
ses.setAttribute("payment",pay);

ticket ticket=(ticket)ses.getAttribute("ticket");
ticket.setPay(pay);
        String jsonSting = req.getParameter("payment");
        PrintWriter out =resp.getWriter();
        try{
            paymentinfo paydata = mapper.readValue(jsonSting, paymentinfo.class);
              out.print(mapper.writeValueAsString(paydata));
        }catch (JsonGenerationException e) {
            e.printStackTrace();
        }

//        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/reviewPayment.jsp");
//        dispatcher.forward(req, resp);
    }
}
