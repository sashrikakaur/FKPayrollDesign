import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import Models.Employee;
public class EmployeeController {
    HashMap<Integer, Employee> map = new HashMap<>();

    public void add(Employee e){
        if(e==null){
            return;
        }
        map.put(e.getEid(),e);
    }

    public void delete(int eid){
        if(map.containsKey(eid)){
            map.remove(eid);
        }
    }
//change direct access through eid

    public void runPayrollforEmployee(LocalDate date, TimeCardController tc, CommissionController cc){
    //check for date too    
    for(Map.Entry entry: map.entrySet()){
        Employee curr = (Employee)entry.getValue();
        double salaryToBePaid = 0;
        if(curr.isSalaried()){
            //biweekly 
            Calendar 
            salaryToBePaid = cc.runCommissionPayrollforEmployee(curr.getEid(), date);
            //monthly
            // salaryToBePaid += curr.getSalary();
        }else{
            //weekly
            salaryToBePaid = tc.runPayrollforEmployee(curr.getEid(), curr.getHourlyrate(), date);
        }
    
    
    }
        //hourly employee payment every week
        tc.runPayroll(eid);
        //commission added for salaried employees 
            //call commission controller and update     
        //salaried employee payments if month end
    }

    public void makePayment(){
        //make payment and make unpaidearning 0
    }
    
}