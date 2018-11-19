import Model.address;
import Model.registeruser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/bookticket")
public class bookTicket extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name= req.getParameter("username");
       String mobile= req.getParameter("mobile");
       String password= req.getParameter("password");
       String email=req.getParameter("email");
       String street= req.getParameter("street");
       String city= req.getParameter("city");
       String state= req.getParameter("state");
       String zipcode= req.getParameter("zipcode");

address adr=new address(city,state,street,zipcode);
registeruser register= new registeruser(name,mobile,password,email,adr);

        HttpSession ses= req.getSession();
        ses.setAttribute("user",register);

        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/bookTicket.jsp");
        dispatcher.forward(req, resp);
    }
}
