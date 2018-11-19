package Model;

public class paymentinfo {
    private String cardno;
    private String nameoncard;
    private String cardtype;
    private String month;
    private String year;
    private String cvvno;
    private double amount;
    private registeruser user;

    public paymentinfo() {
    }

    public registeruser getUser() {
        return user;
    }


    public void setUser(registeruser user) {
        this.user = user;
    }

    public paymentinfo(String cardno, String nameoncard, String cardtype, String month, String year, String cvvno, double amount, registeruser user) {
        this.cardno = cardno;
        this.nameoncard = nameoncard;
        this.cardtype = cardtype;
        this.month = month;
        this.year = year;
        this.cvvno = cvvno;
        this.amount = amount;
        this.user= user;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getNameoncard() {
        return nameoncard;
    }

    public void setNameoncard(String nameoncard) {
        this.nameoncard = nameoncard;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCvvno() {
        return cvvno;
    }

    public void setCvvno(String cvvno) {
        this.cvvno = cvvno;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
