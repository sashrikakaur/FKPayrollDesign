package Models;

import java.time.LocalDate;

public class SalesCommission {
   
    private int id;
    private int eid;
    private LocalDate date;
    private double commissionRate;
 
    public SalesCommission(int id, int eid, LocalDate date, double commissionRate) {
       this.id = id;
       this.eid = eid;
       this.date = date;
       this.commissionRate = commissionRate;
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

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}