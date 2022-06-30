import javax.swing.JOptionPane;

public class Run {

	// Class variables
	private double caloriesBurntModerate = 0;
	private float minutesExercisedModerate = 0;
	private float totalMinutesExercisedModerate = 0;
	
	private double caloriesBurntVigorous = 0;
	private float minutesExercisedVigorous = 0;
	private float totalMinutesExercisedVigorous = 0;
	
	private static double totalCaloriesRun = 0;
	private static float totalMinutesRun = 0;
	
	// Calculates data for moderate exercise
	public double runModerate () {
		minutesExercisedModerate = Float.parseFloat(JOptionPane.showInputDialog("How much time did you spend running/jogging?"));
		caloriesBurntModerate += minutesExercisedModerate * 12;
		
		totalMinutesExercisedModerate += minutesExercisedModerate;
		
		// System.out.print("You burned " + caloriesBurntModerate + " calories running/jogging moderately");
		// System.out.print("\nYou exercised " + totalMinutesExercisedModerate + " minutes.\n\n");
		
		return caloriesBurntModerate;
	}
	
	// Calculates data for vigorous exercise
	public double runVigorous () {
		minutesExercisedVigorous = Float.parseFloat(JOptionPane.showInputDialog("How much time did you spend running/jogging?"));
		caloriesBurntVigorous += minutesExercisedVigorous * 17;
		
		totalMinutesExercisedVigorous += minutesExercisedVigorous;
		
		// System.out.print("You burned " + caloriesBurntVigorous + " calories running/jogging vigorously");
		// System.out.print("\nYou exercised " + totalMinutesExercisedVigorous + " minutes.\n\n");
		
		return caloriesBurntVigorous;
	}
	
	// Calculates total values for exercise
	public void totalValues () {
		totalCaloriesRun = caloriesBurntModerate + caloriesBurntVigorous;
		totalMinutesRun = totalMinutesExercisedModerate + totalMinutesExercisedVigorous;
		
		// System.out.print("Total calories burnt running: " + totalCaloriesRun + "\nTotal minutes ran: " + totalMinutesRun + "\n\n");
	}
	
	public static double getTotalCaloriesRun()
	{
		return totalCaloriesRun;
	}
	
	public static double getTotalMinutesRun()
	{
		return totalMinutesRun;
	}
}
