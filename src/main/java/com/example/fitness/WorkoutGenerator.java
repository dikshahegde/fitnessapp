package com.example.fitness;
import java.util.ArrayList;
import java.util.List;

public class WorkoutGenerator {
	public WorkoutPlan generateWorkoutPlan(UserProfile userProfile) {
        List<String> exercises = new ArrayList<>();
        int sets = 3; // Default value
        int reps = 10; // Default value

        // Determine exercises based on fitness goal
        switch (userProfile.fitnessGoal) {
            case "weight_loss":
                exercises.add("Running");
                exercises.add("Cycling");
                exercises.add("Burpees");
                
                break;
            case "muscle_gain":
                exercises.add("Bench Press");
                exercises.add("Squats");
                exercises.add("Deadlifts");
                exercises.add("Planks");
                exercises.add("Lunges");
       
               break;
            case "endurance":
                exercises.add("Jump Rope");
                exercises.add("High Knees");
                exercises.add("Mountain Climbers");
                exercises.add("Hiking");
                exercises.add("Rowing");
                break;
            case "flexibility":
                exercises.add("Yoga");
                exercises.add("Stretching");
                exercises.add("Pilates");
                break;
            default:
                throw new IllegalArgumentException("Invalid fitness goal");
        }

        // Adjust sets and reps based on fitness level
        switch (userProfile.fitnessLevel) {
            case "beginner":
                sets = 2;
                reps = 8;
                break;
            case "intermediate":
                sets = 3;
                reps = 10;
                break;
            case "advanced":
                sets = 4;
                reps = 12;
                break;
            default:
                throw new IllegalArgumentException("Invalid fitness level");
        }

        // Adjust exercises based on workout preference
        if (userProfile.workoutPreference.equals("strength")) {
            exercises.add("Push-ups");
            exercises.add("Pull-ups");
        } else if (userProfile.workoutPreference.equals("cardio")) {
            exercises.add("Jumping Jacks");
            exercises.add("Sprints");
        } else if (userProfile.workoutPreference.equals("flexibility")) {
            exercises.add("Hamstring Stretch");
            exercises.add("Shoulder Stretch");
        } else if (userProfile.workoutPreference.equals("balance")) {
            exercises.add("Single Leg Stand");
            exercises.add("Bosu Ball Exercises");
            exercises.add("Heal-to-toe walk");
            exercises.add("Standing March");
            
        }

        // Handle restrictions/injuries
        if (userProfile.restrictions.contains("back_pain")) {
            exercises.remove("Deadlifts");
            exercises.add("Swimming");
        } else if (userProfile.restrictions.contains("knee_pain")) {
            exercises.remove("Squats");
            exercises.add("Leg Raises");
        } else if (userProfile.restrictions.contains("shoulder_injury")) {
            exercises.remove("Bench Press");
            exercises.add("Resistance Band Exercises");
        }

        // Create and return the workout plan
        return new WorkoutPlan(exercises, sets, reps);
    }

}
