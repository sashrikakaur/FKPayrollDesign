import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import Models.SalesCommission;


public class CommissionController {
    static HashMap<Integer, ArrayList<SalesCommission>> CommissionList = new HashMap<>();
    public void generateSalReceipt(int eid, SalesCommission saleReceipt) {
        //function called at the end of day
		if(CommissionList.containsKey(eid)){
            ArrayList<SalesCommission> l = CommissionList.get(eid);
            l.add(saleReceipt);
            CommissionList.put(eid,l);
        }else{
            ArrayList<SalesCommission> l = new ArrayList<>();
            l.add(saleReceipt);
            CommissionList.put(eid,l);
        }
	}



	public double runCommissionPayrollforEmployee(int eid, LocalDate currDate){ 
            //function called biweekly ever second friday
            ArrayList<SalesCommission> receipts = CommissionList.get(eid);
            double earning = 0;
            for(int counter = 0; counter< receipts.size(); counter++){
                SalesCommission salesReceipt = receipts.get(counter);
                LocalDate checkDate = salesReceipt.getDate();
                if(Duration.between(currDate.atStartOfDay(), checkDate.atStartOfDay()).toDays()<=14){
                    double rate = salesReceipt.getCommissionRate();
                    earning += rate;
                }
            }
            //can remove the previous entry of timecards if not needed
            return earning;
    }
    
}