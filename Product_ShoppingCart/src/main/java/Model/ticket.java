package Model;

import java.time.LocalDate;
import java.util.Objects;

public class ticket {
    private movie movie;
    private String dateofshow;
    private String showtime;
    private String noseat;
    private registeruser user;
    private paymentinfo pay;


    public paymentinfo getPay() {
        return pay;
    }

    public void setPay(paymentinfo pay) {
        this.pay = pay;
    }

    public registeruser getUser() {
        return user;
    }

    public void setUser(registeruser user) {
        this.user = user;
    }

    public ticket() {
        super();
        this.movie = new movie();
        this.dateofshow = "";
        this.noseat="";
        this.showtime ="";
        this.user = new registeruser();
        this.pay = new paymentinfo();
    }

    public ticket( String dateofshow, String showtime, String noseat) {
               this.dateofshow = dateofshow;
        this.showtime = showtime;
        this.noseat = noseat;


    }

    public Model.movie getMovie() {
        return movie;
    }

    public void setMovie(Model.movie movie) {
        this.movie = movie;
    }

    public String getDateofshow() {
        return dateofshow;
    }

    public void setDateofshow(String dateofshow) {
        this.dateofshow = dateofshow;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public String getNoseat() {
        return noseat;
    }

    public void setNoseat(String noseat) {
        this.noseat = noseat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ticket)) return false;
        ticket ticket = (ticket) o;
        return Objects.equals(getMovie(), ticket.getMovie()) &&
                Objects.equals(getDateofshow(), ticket.getDateofshow()) &&
                Objects.equals(getShowtime(), ticket.getShowtime()) &&
                Objects.equals(getNoseat(), ticket.getNoseat()) &&
                Objects.equals(getUser(), ticket.getUser()) &&
                Objects.equals(getPay(), ticket.getPay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMovie(), getDateofshow(), getShowtime(), getNoseat(), getUser(), getPay());
    }
}
