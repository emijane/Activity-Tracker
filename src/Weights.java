import javax.swing.JOptionPane;

public class Weights {

	// Class variables
	private double caloriesBurntModerate = 0;
	private float minutesExercisedModerate = 0;
	private float totalMinutesExercisedModerate = 0;
	
	private double caloriesBurntVigorous = 0;
	private float minutesExercisedVigorous = 0;
	private float totalMinutesExercisedVigorous = 0;
	
	private static double totalCaloriesWeights = 0;
	private static float totalMinutesWeights = 0;
	
	// Calculates data for moderate exercise
	public double weightsModerate () {
		minutesExercisedModerate = Float.parseFloat(JOptionPane.showInputDialog("How much time did you spend lifting weights?"));
		caloriesBurntModerate += minutesExercisedModerate * 3.7;
		
		totalMinutesExercisedModerate += minutesExercisedModerate;
		
		// System.out.print("You burned " + caloriesBurntModerate + " calories lifting weights moderately");
		// System.out.print("\nYou exercised " + totalMinutesExercisedModerate + " minutes.\n\n");
		return caloriesBurntModerate;
	}
	
	// Calculates data for vigorous exercise
	public double weightsVigorous () {
		minutesExercisedVigorous = Float.parseFloat(JOptionPane.showInputDialog("How much time did you spend lifting weights?"));
		caloriesBurntVigorous += minutesExercisedVigorous * 5.9;
		
		totalMinutesExercisedVigorous += minutesExercisedVigorous;
		
		// System.out.print("You burned " + caloriesBurntVigorous + " calories lifting weights vigorously");
		// System.out.print("\nYou exercised " + totalMinutesExercisedVigorous + " minutes.\n\n");
		return caloriesBurntVigorous;
	}
	
	// Calculates total values for exercise
	public void totalValues () {
		totalCaloriesWeights = caloriesBurntModerate + caloriesBurntVigorous;
		totalMinutesWeights = totalMinutesExercisedModerate + totalMinutesExercisedVigorous;
		
		// System.out.print("Total calories burnt lifting weights: " + totalCaloriesWeights + "\nTotal minutes lifting weights: " + totalMinutesWeights + "\n\n");
	}
	
	public static double getTotalCaloriesWeights()
	{
		return totalCaloriesWeights;
	}
	
	public static double getTotalMinutesWeights()
	{
		return totalMinutesWeights;
	}
}
