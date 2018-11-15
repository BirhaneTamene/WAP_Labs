import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/support")
public class Support extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<html><head><title>CS-tech support</title>");
        out.print("<link rel='stylesheet' href='style.css'/></head>");
        out.print("<body><h1>Welcome to the CSTech Support, Please fill the form below.</h1>");
        out.print("<form method='POST'><br />");
        out.print("Name:    <input type='text'  name='name' /><br />");
        out.print("Email:   <input type='email' name='email' /><br />");
        out.print("Problem: <input type='text' name='problem' /><br />");
        out.print("Problem Description: <br/><textarea name='description' placeholder='problem description' rows='5' cols='30'></textarea><br /><br />");
        out.print("<input type='submit' value='submit' />");
        out.print("</form></body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String problem = req.getParameter("problem");

        ServletContext context = this.getServletContext();
        String contextInit = context.getInitParameter("support-email");
        String ticket = "CSTech"+ Double.toString(Math.random());

        PrintWriter out = resp.getWriter();
        out.print("<html><head><title>CS-tech support</title>");
        out.print("<link rel='stylesheet' href='style.css' /></head>");
        out.print("<body><p>Thank you! "+name+" for contacting us. You should receive reply from us with in 24 hrs in your email address ");
        out.print(email+". <br/>Let us know in our support email "+contextInit);
        out.print(" if you don't receive reply within 24 hrs. Please be sure to attach your reference ");
        out.print(ticket+" in your email.");
        out.print("</p></body></html>");
    }
}
