import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import Models.TimeCard;

public class TimeCardController {
    static HashMap<Integer, ArrayList<TimeCard>> hourlylist = new HashMap<>();
    public void generateCard(int eid, TimeCard timeCard) {
        //function called at the end of day
		if(hourlylist.containsKey(eid)){
            ArrayList<TimeCard> l = hourlylist.get(eid);
            l.add(timeCard);
            hourlylist.put(eid,l);
        }else{
            ArrayList<TimeCard> l = new ArrayList<>();
            l.add(timeCard);
            hourlylist.put(eid,l);
        }
	}



	public double runPayrollforEmployee(int eid,int rate, LocalDate currDate){ 
        
            ArrayList<TimeCard> cards = hourlylist.get(eid);
            double earning = 0;
            for(int counter = 0; counter< cards.size(); counter++){
                TimeCard employeeCard = cards.get(counter);
                LocalDate checkDate = employeeCard.getDate();
                if(Duration.between(currDate.atStartOfDay(), checkDate.atStartOfDay()).toDays()<=7){
                    int hours = employeeCard.getNoOfHours();
                    if(hours>8){
                        earning = earning + (8*rate) + (hours-8)*rate*1.5; 
                    }else{
                        earning += hours*rate;
                    }
                }
            }
            //can remove the previous entry of timecards if not needed
            return earning;
    }
    
}