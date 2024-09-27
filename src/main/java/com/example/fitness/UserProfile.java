package com.example.fitness;

public class UserProfile {
	String fitnessGoal;
    String fitnessLevel;
    String workoutPreference;
    String restrictions;
    String foodRestriction;
    String allergy;
   

    public UserProfile(String fitnessGoal, String fitnessLevel, String workoutPreference, String restrictions,String foodRestriction,String allergy) {
        this.fitnessGoal = fitnessGoal;
        this.fitnessLevel = fitnessLevel;
        this.workoutPreference = workoutPreference;
        this.restrictions = restrictions;
        this.foodRestriction = foodRestriction;
        this.allergy = allergy;
        
    }


}
