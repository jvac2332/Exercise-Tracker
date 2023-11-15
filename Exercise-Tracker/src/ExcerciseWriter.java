import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class ExcerciseWriter {
    public static boolean printExercisesToFile(List<Exercise> exercises, String fname) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fname))));
            for (Exercise exercise: exercises) {
                pw.printf("%s\t%s\t%s\t%.2f",exercise.getName(),exercise.geTypString(),"Date",exercise.getCaloriesBurned());
            }
            pw.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public static void tabulateSummary(List<Exercise> exercises){

        //Collections.sort(exercises);
        for(Exercise exercise : exercises){
            System.out.print(exercise);
            //System.out.printf();
        }
    }

   
}
