import javax.swing.JOptionPane;

public class Swim {

	// Class variables
	private double caloriesBurntModerate = 0;
	private float minutesExercisedModerate = 0;
	private float totalMinutesExercisedModerate = 0;
	
	private double caloriesBurntVigorous = 0;
	private float minutesExercisedVigorous = 0;
	private float totalMinutesExercisedVigorous = 0;
	
	private static double totalCaloriesSwim = 0;
	private static float totalMinutesSwim = 0;
	
	// Calculates data for moderate exercise
	public double swimModerate () {
		minutesExercisedModerate = Float.parseFloat(JOptionPane.showInputDialog("How much time did you spend swimming?"));
		caloriesBurntModerate += minutesExercisedModerate * 6.8;
		
		totalMinutesExercisedModerate += minutesExercisedModerate;
		
		// System.out.print("You burned " + caloriesBurntModerate + " calories swimming moderately");
		// System.out.print("\nYou exercised " + totalMinutesExercisedModerate + " minutes.\n\n");
		return caloriesBurntModerate;
	}
	
	// Calculates data for vigorous exercise
	public double swimVigorous () {
		minutesExercisedVigorous = Float.parseFloat(JOptionPane.showInputDialog("How much time did you spend swimming?"));
		caloriesBurntVigorous += minutesExercisedVigorous * 14.8;
		
		totalMinutesExercisedVigorous += minutesExercisedVigorous;
		
		// System.out.print("You burned " + caloriesBurntVigorous + " calories swimming vigorously");
		// System.out.print("\nYou exercised " + totalMinutesExercisedVigorous + " minutes.\n\n");
		
		return caloriesBurntVigorous;
	}
	
	// Calculates total values for exercise
	public void totalValues () {
		totalCaloriesSwim = caloriesBurntModerate + caloriesBurntVigorous;
		totalMinutesSwim = totalMinutesExercisedModerate + totalMinutesExercisedVigorous;
		
		// System.out.print("Total calories burnt swimming: " + totalCaloriesSwim + "\nTotal minutes swam: " + totalMinutesSwim + "\n\n");
	}
	
	public static double getTotalCaloriesSwim()
	{
		return totalCaloriesSwim;
	}
	
	public static double getTotalMinutesSwim()
	{
		return totalMinutesSwim;
	}
}
