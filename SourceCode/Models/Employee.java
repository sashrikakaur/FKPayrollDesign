package Models;
enum Payment {PAYMASTER, BANK, POSTAL}
public class Employee {

    private int eid;
    private String ename;
    private double monthlySalary;
    private double hourlyrate;
    private Payment paymentMethod;
    private boolean salaried;

 
    public Employee(int eid, String ename, double salary, Payment paymentMethod, boolean salaried) {
       this.eid = eid;
       this.ename = ename;
       if(salaried==true){
         this.monthlySalary = salary;
       }else{
         this.hourlyrate = salary;
       }
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

    public boolean isSalaried( ) {
        return salaried;
     }
     
     public void setSalaried(boolean salaried) {
        this.salaried = salaried;
     }

     public double getHourlyrate() {
        return hourlyrate;
     }

     public void setHourlyrate(double hourlyrate) {
        this.hourlyrate = hourlyrate;
     }

     public Payment getPaymentMethod() {
        return paymentMethod;
     }

     public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
      }
}