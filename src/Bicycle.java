import javax.swing.JOptionPane;

public class Bicycle {
	
	
	// Class variables
	private double caloriesBurntModerate = 0;
	private float minutesExercisedModerate = 0;
	private float totalMinutesExercisedModerate = 0;
	
	private double caloriesBurntVigorous = 0;
	private float minutesExercisedVigorous = 0;
	private float totalMinutesExercisedVigorous = 0;
	
	public static double totalCaloriesBicycle = 0;
	private static float totalMinutesBicycle = 0;
	
	// Calculates data for moderate exercise
	public double bicycleModerate () {
		minutesExercisedModerate = Float.parseFloat(JOptionPane.showInputDialog("How much time did you spend biking?"));
		caloriesBurntModerate += minutesExercisedModerate * 10;
		
		totalMinutesExercisedModerate += minutesExercisedModerate;
		
		// System.out.print("You burned " + caloriesBurntModerate + " calories biking moderately");
		// System.out.print("\nYou exercised " + totalMinutesExercisedModerate + " minutes.\n\n");
		
		return caloriesBurntModerate;
	}
	
	// Calculates data for vigorous exercise
	public double bicycleVigorous () {
		minutesExercisedVigorous = Float.parseFloat(JOptionPane.showInputDialog("How much time did you spend biking?"));
		caloriesBurntVigorous += minutesExercisedVigorous * 14.3;
		
		totalMinutesExercisedVigorous += minutesExercisedVigorous;
		
		// System.out.print("You burned " + caloriesBurntVigorous + " calories biking vigorously");
		// System.out.print("\nYou exercised " + totalMinutesExercisedVigorous + " minutes.\n\n");
		
		return caloriesBurntVigorous;
	}
	
	// Calculates total values for exercise
	public void totalValues () {
		totalCaloriesBicycle = caloriesBurntModerate + caloriesBurntVigorous;
		totalMinutesBicycle = totalMinutesExercisedModerate + totalMinutesExercisedVigorous;
		
		// System.out.print("Total calories burnt biking: " + totalCaloriesBicycle + "\nTotal minutes biking: " + totalMinutesBicycle + "\n\n");
	}
	
	public static double getTotalCaloriesBicycle()
	{
		return totalCaloriesBicycle;
	}
	
	public static double getTotalMinutesBicycle()
	{
		return totalMinutesBicycle;
	}
}
