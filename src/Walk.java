import javax.swing.JOptionPane;

public class Walk {

	// Class variables
	private double caloriesBurntModerate = 0;
	private float minutesExercisedModerate = 0;
	private float totalMinutesExercisedModerate = 0;
	
	private double caloriesBurntVigorous = 0;
	private float minutesExercisedVigorous = 0;
	private float totalMinutesExercisedVigorous = 0;
	
	private static double totalCaloriesWalk = 0;
	private static float totalMinutesWalk = 0;
	
	// Calculates data for moderate exercise
	public double walkModerate () {
		minutesExercisedModerate = Float.parseFloat(JOptionPane.showInputDialog("How much time did you spend walking?"));
		caloriesBurntModerate += minutesExercisedModerate * 5;
		
		totalMinutesExercisedModerate += minutesExercisedModerate;
		
		// System.out.print("You burned " + caloriesBurntModerate + " calories walking moderately");
		// System.out.print("\nYou exercised " + totalMinutesExercisedModerate + " minutes.\n\n");
		return caloriesBurntModerate;
	}
	
	// Calculates data for vigorous exercise
	public double walkVigorous () {
		minutesExercisedVigorous = Float.parseFloat(JOptionPane.showInputDialog("How much time did you spend walking?"));
		caloriesBurntVigorous += minutesExercisedVigorous * 5.6;
		
		totalMinutesExercisedVigorous += minutesExercisedVigorous;
		
		// System.out.print("You burned " + caloriesBurntVigorous + " calories walking vigorously");
		// System.out.print("\nYou exercised " + totalMinutesExercisedVigorous + " minutes.\n\n");
		return caloriesBurntVigorous;
	}
	
	// Calculates total values for exercise
	public void totalValues () {
		totalCaloriesWalk = caloriesBurntModerate + caloriesBurntVigorous;
		totalMinutesWalk = totalMinutesExercisedModerate + totalMinutesExercisedVigorous;
		
		// System.out.print("Total calories burnt walking: " + totalCaloriesWalk + "\nTotal minutes walked: " + totalMinutesWalk + "\n\n");
	}
	
	public static double getTotalCaloriesWalk()
	{
		return totalCaloriesWalk;
	}
	
	public static double getTotalMinutesWalk()
	{
		return totalMinutesWalk;
	}
}
