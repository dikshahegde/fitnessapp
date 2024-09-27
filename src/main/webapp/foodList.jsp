<%@ page import="java.util.List" %>
<%@ page import="com.example.fitness.FoodPlan" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Food Plan</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Your Personalized Food Plan</h1>

        <%
        // Retrieve the food plan object from the request attribute
        FoodPlan foodPlan = (FoodPlan) request.getAttribute("foodPlan");

        List<String> foodList = null; // Declare foodList

        if (foodPlan != null) {
            foodList = foodPlan.getFoodPlan(); // Initialize foodList
        }
        %>

        <% if (foodList != null && !foodList.isEmpty()) { %>

        <ul class="food-list">
            <% for (String foodItem : foodList) { %>
            <li>
                <%= foodItem %>
            </li>
            <% } %>
        </ul>

        <form action="feedback.html" method="get">
            <button type="submit">Next</button>
        </form>

        <% } else { %>
        <p>No food plan generated. Please go back and enter your preferences.</p>
        <% } %>
    </div>
</body>
</html>
