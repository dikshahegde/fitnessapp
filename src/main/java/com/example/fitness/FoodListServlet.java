package com.example.fitness;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/foodList")
public class FoodListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve the food plan from the session
        FoodPlan foodPlan = (FoodPlan) request.getSession().getAttribute("foodPlan");

        if (foodPlan != null) {
            // Forward to the JSP page and pass the foodPlan object as a request attribute
            request.setAttribute("foodPlan", foodPlan);
            request.getRequestDispatcher("/foodList.jsp").forward(request, response);
        } else {
            // If foodPlan is not found, redirect to an error page or handle the error appropriately
            response.sendRedirect("errorPage.jsp");
        }
    }
}