<%@ page import="java.util.List" %>
<%@ page import="com.example.fitness.WorkoutPlan" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Workout Plan</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Your Personalized Workout Plan</h1>

        <%
            // Retrieve the workout plan object from the request attribute
            WorkoutPlan workoutPlan = (WorkoutPlan) request.getAttribute("workoutPlan");

            if (workoutPlan != null) {
                List<String> exercises = workoutPlan.getExercises();
        %>

        <ul class="exercise-list">
            <%
                for (String exercise : exercises) {
            %>
            <li>
                <%= exercise %>
            </li>
            <%
                }
            %>
        </ul>

        <!-- Form to go to the food plan page -->
        <form action="foodList" method="get"> <!-- Updated to use the correct servlet URL -->
            <button type="submit">View Your Food Plan</button>
        </form>

        <%
            } else {
        %>
        <p>No workout plan generated. Please go back and enter your preferences.</p>
        <%
            }
        %>
    </div>
</body>
</html>
