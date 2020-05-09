import java.sql.Date;

public class TimeCard {
    
    private int eid;
    private Date date;
    private int noOfHours;
    private boolean paid;
 
    public TimeCard(int eid, Date date, int noOfHours) {
       this.eid = eid;
       this.date = date;
       this.noOfHours = noOfHours;
       this.paid = false;
    }
 
    public int getEid( ) {
       return eid;
    }
    
    public void setEid(int eid) {
       this.eid = eid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}