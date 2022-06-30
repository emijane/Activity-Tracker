import javax.swing.JOptionPane;

public class ActivityInputs {
	
	float minutesExercised = 0;
	Boolean programRunning = true;
	
	int workoutIntensityInput;
	
	// Class references
	Bicycle bicycle = new Bicycle();
	Run run = new Run();
	Swim swim = new Swim();
	Walk walk = new Walk();
	Weights weights = new Weights();
	ExitProgram exitProgram = new ExitProgram();

	public void activityInputs () {
		
		// While programRunnig == true, continue the program.
		while (programRunning) {
			int activityMonitorInput;

			
			// Take user input on which activity they'd like to log
			activityMonitorInput =  Integer.parseInt(JOptionPane.showInputDialog(
					"Activity Monitor\n\n"
					+ "Press 1 for Bicycle\n"
					+ "Press 2 for Running/Jogging\n"
					+ "Press 3 for Swimming\n"
					+ "Press 4 for Walking\n"
					+ "Press 5 for Weight Training\n"
					+ "Press 6 for Exit\n"
					));
			
			// Validation for numbers less than 0 or greater than 6
			while (activityMonitorInput < 0 || activityMonitorInput > 6) {
				activityMonitorInput = Integer.parseInt(JOptionPane.showInputDialog("ENTER A NUMBER BETWEEN 1 AND 6\n\n" 
						+ "Activity Monitor\n\n"
						+ "Press 1 for Bicycle\n"
						+ "Press 2 for Running/Jogging\n"
						+ "Press 3 for Swimming\n"
						+ "Press 4 for Walking\n"
						+ "Press 5 for Weight Training\n"
						+ "Press 6 for Exit\n"));
			}
			
			
			// If the user enters 1 - Bicycle class will be utilized 
			// Calculates data such as total number of calories consumed
			// and total time spent biking.
			if (activityMonitorInput == 1) {
				exerciseIntensity();
				
				// Moderate
				if (workoutIntensityInput == 1) { // If user chooses 1 under "Workout intensity" 
					bicycle.bicycleModerate();    // bicycleModerate method is ran under the Bicycle class.
				// Vigorous
				} else if (workoutIntensityInput == 2) { // If user chooses 2 under "Workout intensity"
					bicycle.bicycleVigorous();		     // bicycleVigorous method is ran under the Bicycle class.
				}
				
				bicycle.totalValues();
			}
			
			// If the user enters 2 - Run class will be utilized
			// Calculates data such as total number of calories consumed
			// and total time spent running.
			else if (activityMonitorInput == 2) {
				exerciseIntensity();
				
				// Moderate
				if (workoutIntensityInput == 1) {
					run.runModerate();
				// Vigorous
				} else if (workoutIntensityInput == 2) {
					run.runVigorous();
				}
				
				run.totalValues();
			}
			
			// If the user enters 3 - Swim class will be utilized
			// Calculates data such as total number of calories consumed
			// and total time spent swimming.
			else if (activityMonitorInput == 3) {
				exerciseIntensity();
				
				// Moderate
				if (workoutIntensityInput == 1) {
					swim.swimModerate();
				// Vigorous
				} else if (workoutIntensityInput == 2) {
					swim.swimVigorous();
				}
				
				swim.totalValues();
			}
			
			// If the user enters 4 - Walk class will be utilized
			// Calculates data such as total number of calories consumed
			// and total time spent walking.
			else if (activityMonitorInput == 4) {
				exerciseIntensity();
				
				// Moderate
				if (workoutIntensityInput == 1) {
					walk.walkModerate();
				// Vigorous
				} else if (workoutIntensityInput == 2) {
					walk.walkVigorous();
				}
				
				walk.totalValues();
			}
			
			// If the user enters 5 - Weights class will be utilized
			// Calculates data such as total number of calories consumed
			// and total time spent lifting weights.
			else if (activityMonitorInput == 5) {
				exerciseIntensity();
				
				// Moderate
				if (workoutIntensityInput == 1) {
					weights.weightsModerate();
				// Vigorous
				} else if (workoutIntensityInput == 2) {
					weights.weightsVigorous();
				}
				
				weights.totalValues();
			}
			
			// If the user enters 6 - ExitProgram class will be utilized
			// Displays in a message box the data of activites 1-5.
			else if (activityMonitorInput == 6) {
				exitProgram.displayExerciseData();
			}
			
		}
	}
	
	// Separate method for Exercise Intensity - prompted for each exercise
	public void exerciseIntensity() {
		// Take user input on whether they'd like to log their 
		// activity as moderate or vigorous
		workoutIntensityInput =  Integer.parseInt(JOptionPane.showInputDialog(
				"Your Workout Intensity\n\n"
				+ "Press 1 for Moderate\n"
				+ "Press 2 for Vigorous"
				));
	}
}
