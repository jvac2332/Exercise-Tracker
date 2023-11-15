import java.util.Date;

public class RunWalk extends Exercise {
    double miles;

    @Override
    public double getCaloriesBurned() {
        return minutes;
        //return (miles/timeinminutes)*9000
    }

    public RunWalk(String name, String comment, Date date, int minutes,double miles) {
        super(name, comment, date,minutes);
        this.miles = miles;
    }

    public RunWalk() {
        super();
        this.miles = 0;
    }

    @Override
    public String geTypString() {
        
        return "RunWalk";
    }

    
    
}
