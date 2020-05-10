package Models;

import java.time.LocalDate;

public class TimeCard {
    
    private int id;
    private int eid;
    private LocalDate date;
    private int noOfHours;
    private boolean paid;
 
    public TimeCard(int id, int eid, LocalDate date, int noOfHours) {
       this.id = id;
       this.eid = eid;
       this.date = date;
       this.noOfHours = noOfHours;
       this.paid = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 
    public int getEid( ) {
       return eid;
    }
    
    public void setEid(int eid) {
       this.eid = eid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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