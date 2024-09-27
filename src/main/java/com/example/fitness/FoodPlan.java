package com.example.fitness;

import java.util.List;

public class FoodPlan {
    private List<String> food;

    // Constructor to initialize the food list
    public FoodPlan(List<String> food) {
        this.food = food;
    }

    // Getter method to retrieve the food plan list
    public List<String> getFoodPlan() {
        return food;
    }
}
