import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ExerciseFile {  // Exercise file allows the user to input there workout
    public static boolean printExercisesToFile(ArrayList<Exercise> exercises, String fname) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fname))));
            for (Exercise exercise: exercises) {
                pw.println(exercise);
            }
            pw.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
}
