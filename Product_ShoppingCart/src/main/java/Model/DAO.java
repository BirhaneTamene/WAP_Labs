package Model;

import java.util.ArrayList;
import java.util.List;

public class DAO {
    private List<ticket> ticketdata =new ArrayList<>();

    public List<ticket> getTicketdata() {
        return ticketdata;
    }
    public void setTicketdata(List<ticket> ticketdata) {
        this.ticketdata = ticketdata;
    }
}
