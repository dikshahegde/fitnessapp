package com.example.fitness;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/generateWorkout")
public class WorkoutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve form data
        String fitnessGoal = request.getParameter("fitnessGoal");
        String fitnessLevel = request.getParameter("fitnessLevel");
        String workoutPreference = request.getParameter("workoutPreference");
        String restrictions = request.getParameter("restrictions");
        String foodRestriction = request.getParameter("foodRestriction");
        String allergy = request.getParameter("allergy");

        // Create a user profile
        UserProfile userProfile = new UserProfile(fitnessGoal, fitnessLevel, workoutPreference, restrictions, foodRestriction, allergy);

        // Generate workout plan
        WorkoutGenerator workoutGenerator = new WorkoutGenerator();
        WorkoutPlan workoutPlan = workoutGenerator.generateWorkoutPlan(userProfile);

        // Generate food plan
        FoodGenerator foodGenerator = new FoodGenerator();
        FoodPlan foodPlan = foodGenerator.generateFoodPlan(userProfile);

        // Set the workout plan and food plan as request attributes
        request.setAttribute("workoutPlan", workoutPlan);
        request.getSession().setAttribute("foodPlan", foodPlan);

        // Forward to workoutList.jsp
        request.getRequestDispatcher("workoutList.jsp").forward(request, response);
    }
}
