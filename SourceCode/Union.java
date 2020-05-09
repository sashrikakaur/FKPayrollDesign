import java.sql.Date;

public class Union {
    
    private int eid;
    private Date lastPaidDate;
    private double weeklyDue;
    private double additionalDues;
 
    public Union(int eid, Date lDate, double weeklyDue, double additionalDues) {
       this.eid = eid;
       this.lastPaidDate = lDate;
       this.weeklyDue = weeklyDue;
       this.additionalDues = additionalDues;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public Date getLastPaidDate() {
        return lastPaidDate;
    }

    public void setLastPaidDate(Date lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
    }

    public double getWeeklyDue() {
        return weeklyDue;
    }

    public void setWeeklyDue(double weeklyDue) {
        this.weeklyDue = weeklyDue;
    }

    public double getAdditionalDues() {
        return additionalDues;
    }

    public void setAdditionalDues(double additionalDues) {
        this.additionalDues = additionalDues;
    }
 
}