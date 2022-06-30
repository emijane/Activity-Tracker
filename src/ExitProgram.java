import javax.swing.JOptionPane;

public class ExitProgram {

	// Display Exercise Data
	public void displayExerciseData() {
		JOptionPane.showMessageDialog(null, "Program Results\n\n" +
		"Your total time on bike was " + Bicycle.getTotalMinutesBicycle() + " minutes and your total calories burned were " + Bicycle.getTotalCaloriesBicycle() + " calories\n" +
        "Your total time running was " + Run.getTotalMinutesRun() + " minutes and your total calories burned were " + Run.getTotalCaloriesRun() + " calories\n" +
        "Your total time swimming was " + Swim.getTotalMinutesSwim() + " minutes and your total calories burned were " + Swim.getTotalCaloriesSwim() + " calories\n" +
        "Your total time walking was " + Walk.getTotalMinutesWalk() + " minutes and your total calories burned were " + Walk.getTotalCaloriesWalk() + " calories\n" +
        "Your total time weight training was " + Weights.getTotalMinutesWeights() + " minutes and your total calories burned were " + Weights.getTotalCaloriesWeights() + " calories\n\n");
				
	}
}
