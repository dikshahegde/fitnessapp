package com.example.fitness;

import java.util.List;

public class WorkoutPlan {
    private List<String> exercises;
    private int sets;
    private int reps;

    public WorkoutPlan(List<String> exercises, int sets, int reps) {
        this.exercises = exercises;
        this.sets = sets;
        this.reps = reps;
    }

    public List<String> getExercises() {
        return exercises;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }
}
