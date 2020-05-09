enum Payment {PAYMASTER, BANK, POSTAL}
public class Employee {

    private int eid;
    private String ename;
    private double monthlySalary;
    private Payment paymentMethod;
    private boolean salaried;
 
    public Employee(int eid, String ename, double monthlySalary, Payment paymentMethod, boolean salaried) {
       this.eid = eid;
       this.ename = ename;
       this.monthlySalary = monthlySalary;
       this.paymentMethod = paymentMethod;
       this.salaried = salaried;
    }
 
    public int getEid( ) {
       return eid;
    }
    
    public void setEid(int eid) {
       this.eid = eid;
    }
    
    public String getEname( ) {
       return ename;
    }
    
    public void setEname(String ename) {
       this.ename = ename;
    }
 
    public double getSalary( ) {
       if(salaried==true){
           return monthlySalary;
       }
       return -0.1;
    }
    
    public void setSalary(double salary) {
       if(salaried==true)
        this.monthlySalary = salary;
    }
 
    public Payment getPayment( ) {
       return paymentMethod;
    }
    
    public void setPayment(Payment payment) {
       this.paymentMethod = payment;
    }

    public boolean isSalaried( ) {
        return salaried;
     }
     
     public void setSalaried(boolean salaried) {
        this.salaried = salaried;
     }
 }