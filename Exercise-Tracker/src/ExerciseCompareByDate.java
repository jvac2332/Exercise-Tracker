import java.util.Date;
import java.util.Comparator;

public class ExerciseCompareByDate implements Comparator<Exercise>{

    @Override
    public int compare(Exercise o1, Exercise o2) {
        Date date1= o1.getDate();
        Date date2 = o2.getDate();
        if(date1.getTime() > date2.getTime()){
            return 1;
        } else if (date1.getTime() == date2.getTime()){
            return 0;
        } else {
            return -1;
        }
    }


    
}
