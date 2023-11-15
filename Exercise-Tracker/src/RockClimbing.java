import java.util.Date;

public class RockClimbing extends Exercise {
    int wallheight;
    int repetitions;
    public RockClimbing(String name, String comment, Date date, int minutes, int wallheight, int repetitions) {
        super(name, comment, date, minutes);
        this.wallheight = wallheight;
        this.repetitions = repetitions;
    }
    public RockClimbing() {
        super();
        this.wallheight = 0;
        this.repetitions = 0;
    }
    public int getWallheight() {
        return wallheight;
    }
    public void setWallheight(int wallheight) {
        this.wallheight = wallheight;
    }
    public int getRepetitions() {
        return repetitions;
    }
    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }



    @Override
    public double getCaloriesBurned() {
        return (wallheight * repetitions)/minutes* 100;
    }
    @Override
    public String geTypString() {
        
        return "RockClimbing";
    }
    
}
