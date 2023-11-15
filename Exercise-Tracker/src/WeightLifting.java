import java.util.Date;

public class WeightLifting extends Exercise{
    double WeightLifted;
    int Reps;

    public double getWeightLifted() {
        return WeightLifted;
    }

    public void setWeightLifted(double weightLifted) {
        WeightLifted = weightLifted;
    }

    public int getReps() {
        return Reps;
    }

    public void setReps(int reps) {
        Reps = reps;
    }

    @Override
    public double getCaloriesBurned(){
        return minutes;

    }
    
    public WeightLifting(String name, String comment, Date date, int minutes,double WeightLifted,int reps){
        super(name,comment,date,minutes);
        this.WeightLifted = WeightLifted;
        this.Reps = reps;

    }

    public WeightLifting() {
        super();
        this.WeightLifted = 0;
    }    
    

    @Override
    public String geTypString() {
      
       return "WeightLifting";
    }
    }
