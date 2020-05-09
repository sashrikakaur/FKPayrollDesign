import java.sql.Date;

public class SalesCommission {
   
    private int id;
    private int eid;
    private Date date;
    private double commissionRate;
 
    public SalesCommission(int id, int eid, Date date, double commissionRate) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}