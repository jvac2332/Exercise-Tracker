import java.util.ArrayList;    // The import statements talk on the many things that were needed for the program
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.List;


public class ExerciseApp {


    
    public static Exercise createNewExercise(Scanner sc,char ch){
        Exercise exercise = null;
        //ask questions for all exercise
        switch(ch){
            case 'R':{
            //questions specific for runwalk
            System.out.print("Enter a name for the workout:");
            String name = sc.nextLine();
            System.out.print("Enter date of workout");
            String dateString = sc.nextLine();
            Date date = null;
            try{
                SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                date = df.parse(dateString);
            } catch (Exception exception){
                System.out.println("Error getting date");
            }
            System.out.print("How long did you work out in minutes:");
            int time = sc.nextInt();
            System.out.print("Enter distance you ran or walked in miles:");
            double distance = sc.nextDouble();
            System.out.print("Enter a comment about the workout:");
            String comment = sc.nextLine();

                exercise = new RunWalk(name,comment,date,time,distance);
            return exercise;
        }
        
            case 'W': {
            //questions specific for WeightLifting
            System.out.print("Enter a name for the workout:");
            String name = sc.nextLine();
            
            System.out.print("Enter date of workout");
            String dateString = sc.nextLine();
            Date date = null;
            try{
                SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                date = df.parse(dateString);
            } catch (Exception exception){
                System.out.println("Error getting date");
            }
            System.out.print("How long did you work out in minutes:");
            int time = sc.nextInt();
            System.out.print("Enter total weight lifted in pounds:");
            int reps = sc.nextInt();
            double WeightLifted = sc.nextDouble();
            System.out.print("Enter a comment about the workout:");
            String comment = sc.nextLine();

            exercise = new WeightLifting(name,comment,date,time,WeightLifted,reps);
            return exercise;
         }

        
            case 'C':{
            //questions specific for RockClimbing
            System.out.print("Enter a name for the workout:");
            String name = sc.nextLine();            
            System.out.print("Enter date of workout: ");
            String dateString = sc.nextLine();
            Date date = null;
            try{
                SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                date = df.parse(dateString);
            } catch (Exception exception){
                System.out.println("Error getting date");
            }
            System.out.print("How long did you work out in minutes:");
            int minutes = sc.nextInt();
            System.out.print("Enter the height of the wall in feet:");
            int wallheight = sc.nextInt();
            System.out.print("Enter number of times you climbed it");
            int repetitions = sc.nextInt();
            System.out.print("Enter a comment about the workout:");
            String comment = sc.nextLine();

            exercise = new RockClimbing(name,comment,date,minutes,wallheight,repetitions);
            return exercise;
            }
        }   return exercise;
        
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Exercise> exercises = new ArrayList<Exercise>();
        // Uses the list to help the excrecise in the other tabs
        System.out.println("*****************************************************************");
        System.out.println(" ".repeat(15) + " Exercise Tracker V1.0" + " ".repeat(24));
        /// The repeat helps putting my quotes in the center to line like how the example was\\\
        System.out.println("*****************************************************************");


        while (true){
            System.out.println("These are your choices:");
            System.out.println("1. Add an exercise ");
            System.out.println("2. Print exercises to file");
            System.out.println("3. List sorted by date");
            System.out.println("4. List sorted by calories burned");
            System.out.println("5. Exit");

            System.out.println("Enter the number of your choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            //Choice 3 -- collections.sort(exervices,new ExerciseCompareByDate());
            //Choice 4 -- collections.sort(exercises);

            switch (choice){
                case 1:
                    System.out.println("Describe your workout here: ");// This line asking what your workout was.
                    System.out.println("Enter R for run/walk, W for weightlifting, or C for rock climbing: ");// This line is asking what workout you did. 
                    char exerciseType = sc.nextLine().toUpperCase().charAt(0);
                    Exercise exercise = createNewExercise(sc, exerciseType);
                    exercises.add(exercise);

                case 2: 
                    //List<Exercise> exercises;

                    //ExcerciseWriter.writeExercisesToFile(exercises,fname);
                    

                case 3:
                Collections.sort(exercises,new ExerciseCompareByDate());
                ExcerciseWriter.tabulateSummary(exercises);

                case 4:
                    Collections.sort(exercises);
                    ExcerciseWriter.tabulateSummary(exercises);
                case 5:
                System.out.println("Exit: \n ");

            }
        }
    }
}
