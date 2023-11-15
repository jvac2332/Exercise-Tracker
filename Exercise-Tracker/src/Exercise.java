import java.util.Date;
// The Exercise class allows the constructor when each function is used and for the many different classes.
public abstract class Exercise implements Comparable<Exercise>{
    String name;
    int minutes;
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public Exercise(String name, String comment, Date date, int minutes) {
        this.name = name;
        this.comment = comment;
        this.date = date;
        this.minutes = minutes;

    }

    public Exercise() {
        this.name = date.toString();
        this.comment = "";
        this.date = new Date();
        this.minutes = 0;
    }

    String comment;
    Date date;
    

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getCaloriesBurned();
    public abstract String geTypString();

    @Override
    public String toString(){
        return String.format("%s%15s%15s%15s\n",geTypString(),name,getCaloriesBurned(),date);
    }

    @Override
    public int compareTo(Exercise other){ // This  statement is having the  Calories to tell how they are burned for the specfic excercise
        Double myCalories = getCaloriesBurned();
        Double otherCalories = other.getCaloriesBurned();
        if(myCalories > otherCalories){
            return 1;
        } else if (myCalories == otherCalories){
            return 0;
        } else {
            return -1;
        }
    }

}   