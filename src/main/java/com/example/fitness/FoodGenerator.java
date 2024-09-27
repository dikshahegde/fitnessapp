package com.example.fitness;
import java.util.ArrayList;
import java.util.List;

public class FoodGenerator {
	public FoodPlan generateFoodPlan(UserProfile userProfile) {
        List<String> food = new ArrayList<>();
      
        // Determine exercises based on fitness goal
        

        // Adjust exercises based on workout preference
        if (userProfile.workoutPreference.equals("strength") && userProfile.foodRestriction.equals("vegetarian")) {
            food.add("Legumes");
            food.add("Lentils");
            food.add("Chickpeas");
            food.add("Black Beans");
            food.add("Kidney Beans");
            food.add("Tofu");
            food.add("Tempeh");
            food.add("Quinoa");
            food.add("Edamame");
            food.add("Greek Yogurt");
            food.add("Cottage Cheese");
            food.add("Seitan");
            food.add("Chia Seeds");
            food.add("Avocados");
            food.add("Almonds");
            food.add("Walnuts");
            food.add("Flaxseeds");
            food.add("Pumpkin Seeds");
            food.add("Peanut Butter");
            food.add("Almond Butter");
            food.add("Olive Oil");
            food.add("Brown Rice");
            food.add("Oats");
            food.add("Sweet Potatoes");
            food.add("Barley");
            food.add("Spinach");
            food.add("Kale");
            food.add("Swiss Chard");
            food.add("Broccoli");
            food.add("Fortified Almond Milk");
            food.add("Fortified Soy Milk");
            food.add("Blueberries");
            food.add("Strawberries");
            food.add("Bananas");
            food.add("Dark Chocolate");

            
        } else if (userProfile.workoutPreference.equals("strength") && userProfile.foodRestriction.equals("non_vegetarian")) {
        	food.add("Chicken Breast");
        	food.add("Turkey");
        	food.add("Salmon");
        	food.add("Tuna");
        	food.add("Eggs");
        	food.add("Shrimp");
        	food.add("Lean Beef");
        	food.add("Greek Yogurt");
        	food.add("Cottage Cheese");
        	food.add("Whey Protein");
        	food.add("Sardines");
        	food.add("Shellfish");
        	food.add("Crab");
        	food.add("Chickpeas");
            food.add("Black Beans");
            food.add("Kidney Beans");
            food.add("Tofu");
            food.add("Tempeh");

        } else if (userProfile.workoutPreference.equals("strength") && userProfile.foodRestriction.equals("vegan")) {
        	food.add("Lentils");
        	food.add("Chickpeas");
        	food.add("Black Beans");
        	food.add("Kidney Beans");
        	food.add("Tofu");
        	food.add("Tempeh");
        	food.add("Seitan");
        	food.add("Quinoa");
        	food.add("Edamame");
        	food.add("Hemp Seeds");
        	food.add("Chia Seeds");
        	food.add("Pumpkin Seeds");
        	food.add("Peanut Butter");
        	food.add("Almond Butter");
        	food.add("Sunflower Seeds");
        	food.add("Spirulina");
        	food.add("Oats");
        	food.add("Sweet Potatoes");
        	food.add("Brown Rice");
        	food.add("Barley");
        	food.add("Whole Wheat Bread");
        	food.add("Spinach");
        	food.add("Kale");
        	food.add("Swiss Chard");
        	food.add("Broccoli");
        	food.add("Avocados");
        	food.add("Almond Milk");
        	food.add("Soy Milk");

        } else if (userProfile.workoutPreference.equals("strength") && userProfile.foodRestriction.equals("pescatarian")) {
        	food.add("Salmon");
        	food.add("Tuna");
        	food.add("Shrimp");
        	food.add("Crab");
        	food.add("Tofu");
        	food.add("Edamame");
        	food.add("Quinoa");
        	food.add("Chia Seeds");
        	food.add("Hemp Seeds");
        	food.add("Pumpkin Seeds");
        	food.add("Greek Yogurt");
        	food.add("Cottage Cheese");
        	food.add("Brown Rice");
        	food.add("Sweet Potatoes");

        }
        else if (userProfile.workoutPreference.equals("cardio") && userProfile.foodRestriction.equals("vegetarian")) {
        	food.add("Oats");
        	food.add("Quinoa");
        	food.add("Brown Rice");
        	food.add("Sweet Potatoes");
        	food.add("Bananas");
        	food.add("Berries");
        	food.add("Oranges");
        	food.add("Spinach");
        	food.add("Kale");
        	food.add("Beets");
        	food.add("Carrots");
        	food.add("Broccoli");
        	food.add("Chickpeas");
        	food.add("Lentils");
        	food.add("Black Beans");
        	food.add("Kidney Beans");
        	food.add("Tofu");
        	food.add("Nuts");
        	food.add("Seeds");
        	food.add("Avocados");
        	food.add("Greek Yogurt");
        	food.add("Almond Milk");
        	food.add("Soy Milk");
        	food.add("Whole Grain Bread");
        	food.add("Barley");
        	food.add("Edamame");

        }
        else if (userProfile.workoutPreference.equals("cardio") && userProfile.foodRestriction.equals("non_vegetarian")) {
        	food.add("Chicken Breast");
        	food.add("Salmon");
        	food.add("Tuna");
        	food.add("Eggs");
        	food.add("Shrimp");
        	food.add("Lean Beef");
        	food.add("Greek Yogurt");
        	food.add("Cottage Cheese");
        	food.add("Crab");
        	food.add("Lobster");
        	food.add("Oats");
        	food.add("Quinoa");
        	food.add("Brown Rice");
        	food.add("Sweet Potatoes");
        	food.add("Spinach");
        	food.add("Broccoli");
        	food.add("Berries");
        	food.add("Bananas");

        }
        else if (userProfile.workoutPreference.equals("cardio") && userProfile.foodRestriction.equals("vegan")) {
        	food.add("Oats");
        	food.add("Quinoa");
        	food.add("Brown Rice");
        	food.add("Sweet Potatoes");
        	food.add("Bananas");
        	food.add("Berries");
        	food.add("Oranges");
        	food.add("Spinach");
        	food.add("Kale");
        	food.add("Beets");
        	food.add("Carrots");
        	food.add("Broccoli");
        	food.add("Chickpeas");
        	food.add("Lentils");
        	food.add("Black Beans");
        	food.add("Kidney Beans");
        	food.add("Tofu");
        	food.add("Tempeh");
        	food.add("Chia Seeds");
        	food.add("Hemp Seeds");
        	food.add("Pumpkin Seeds");
        	food.add("Avocados");
        	food.add("Almond Milk");
        	food.add("Soy Milk");
        	food.add("Whole Grain Bread");
        	food.add("Barley");

        }
        else if (userProfile.workoutPreference.equals("cardio") && userProfile.foodRestriction.equals("pescatarian")) {
        	food.add("Salmon");
        	food.add("Tuna");
        	food.add("Shrimp");
        	food.add("Crab");
        	food.add("Lobster");      	
        	food.add("Oats");
        	food.add("Quinoa");
        	food.add("Brown Rice");
        	food.add("Sweet Potatoes");
        	food.add("Bananas");
        	food.add("Berries");
        	food.add("Oranges");
        	food.add("Spinach");
        	food.add("Kale");
        	food.add("Broccoli");
        	food.add("Beets");
        	food.add("Chickpeas");
        	food.add("Lentils");
        	food.add("Tofu");
        	food.add("Edamame");
        	food.add("Whole Grain Bread");

        }
        else if (userProfile.workoutPreference.equals("flexibility") && userProfile.foodRestriction.equals("vegetarian")) {
        	food.add("Spinach");
        	food.add("Kale");
        	food.add("Swiss Chard");
        	food.add("Broccoli");
        	food.add("Avocados");
        	food.add("Bell Peppers");
        	food.add("Carrots");
        	food.add("Beets");
        	food.add("Cucumbers");
        	food.add("Tomatoes");
        	food.add("Chia Seeds");
        	food.add("Flaxseeds");
        	food.add("Almonds");
        	food.add("Walnuts");
        	food.add("Pumpkin Seeds");
        	food.add("Sweet Potatoes");
        	food.add("Quinoa");
        	food.add("Oats");
        	food.add("Brown Rice");
        	food.add("Berries");
        	food.add("Bananas");
        	food.add("Oranges");
        	food.add("Whole Grain Bread");
        	food.add("Edamame");
        	food.add("Lentils");
        	food.add("Chickpeas");

        }
        else if (userProfile.workoutPreference.equals("flexibility") && userProfile.foodRestriction.equals("non_vegetarian")) {
        	food.add("Salmon");
        	food.add("Tuna");
        	food.add("Chicken Breast");
        	food.add("Turkey");
        	food.add("Eggs");
        	food.add("Greek Yogurt");
        	food.add("Cottage Cheese");
        	food.add("Lean Beef");
        	food.add("Shrimp");
        	food.add("Crab");
        	food.add("Lobster");
        	food.add("Oats");
        	food.add("Quinoa");
        	food.add("Brown Rice");
        	food.add("Sweet Potatoes");
        	food.add("Spinach");
        	food.add("Kale");
        	food.add("Broccoli");
        	food.add("Bell Peppers");
        	food.add("Carrots");
        	food.add("Beets");
        	food.add("Berries");
        	food.add("Bananas");
        	food.add("Oranges");

        }
        else if (userProfile.workoutPreference.equals("flexibility") && userProfile.foodRestriction.equals("vegan")) {
        	food.add("Spinach");
        	food.add("Kale");
        	food.add("Swiss Chard");
        	food.add("Broccoli");
        	food.add("Avocados");
        	food.add("Bell Peppers");
        	food.add("Carrots");
        	food.add("Beets");
        	food.add("Cucumbers");
        	food.add("Tomatoes");
        	food.add("Chia Seeds");
        	food.add("Flaxseeds");
        	food.add("Hemp Seeds");
        	food.add("Almonds");
        	food.add("Walnuts");
        	food.add("Pumpkin Seeds");
        	food.add("Sweet Potatoes");
        	food.add("Quinoa");
        	food.add("Oats");
        	food.add("Brown Rice");
        	food.add("Berries");
        	food.add("Bananas");
        	food.add("Oranges");
        	food.add("Whole Grain Bread");
        	food.add("Lentils");
        	food.add("Chickpeas");
        	food.add("Tofu");
        	food.add("Edamame");

        }
        else if (userProfile.workoutPreference.equals("flexibility") && userProfile.foodRestriction.equals("pescatarian")) {
        	food.add("Salmon");
        	food.add("Tuna");
        	food.add("Shrimp");
        	food.add("Sardines");
        	food.add("Spinach");
        	food.add("Kale");
        	food.add("Swiss Chard");
        	food.add("Broccoli");
        	food.add("Avocados");
        	food.add("Bell Peppers");
        	food.add("Carrots");
        	food.add("Beets");
        	food.add("Cucumbers");
        	food.add("Tomatoes");
        	food.add("Chia Seeds");
        	food.add("Flaxseeds");
        	food.add("Almonds");
        	food.add("Walnuts");
        	food.add("Pumpkin Seeds");
        	food.add("Sweet Potatoes");
        	food.add("Quinoa");
        	food.add("Oats");
        	food.add("Brown Rice");
        	food.add("Berries");
        	food.add("Bananas");
        	food.add("Oranges");

        }
        else if (userProfile.workoutPreference.equals("balance") && userProfile.foodRestriction.equals("vegetarian")) {
        	food.add("Spinach");
        	food.add("Kale");
        	food.add("Swiss Chard");
        	food.add("Broccoli");
        	food.add("Avocados");
        	food.add("Sweet Potatoes");
        	food.add("Quinoa");
        	food.add("Oats");
        	food.add("Brown Rice");
        	food.add("Berries");
        	food.add("Bananas");
        	food.add("Oranges");
        	food.add("Beets");
        	food.add("Carrots");
        	food.add("Bell Peppers");
        	food.add("Tomatoes");
        	food.add("Cucumbers");
        	food.add("Lentils");
        	food.add("Chickpeas");
        	food.add("Black Beans");
        	food.add("Kidney Beans");
        	food.add("Tofu");
        	food.add("Tempeh");
        	food.add("Edamame");
        	food.add("Chia Seeds");
        	food.add("Flaxseeds");
        	food.add("Pumpkin Seeds");
        	food.add("Almonds");
        	food.add("Walnuts");

        }
        else if (userProfile.workoutPreference.equals("balance") && userProfile.foodRestriction.equals("non_vegetarian")) {
        	food.add("Chicken Breast");
        	food.add("Turkey");
        	food.add("Salmon");
        	food.add("Tuna");
        	food.add("Eggs");
        	food.add("Shrimp");
        	food.add("Lean Beef");     	
        	food.add("Crab");
        	food.add("Lobster");
        	food.add("Greek Yogurt");
        	food.add("Cottage Cheese");
        	food.add("Spinach");
        	food.add("Kale");
        	food.add("Broccoli");
        	food.add("Sweet Potatoes");
        	food.add("Quinoa");
        	food.add("Oats");
        	food.add("Brown Rice");
        	food.add("Bananas");
        	food.add("Berries");
        	food.add("Oranges");
        	food.add("Beets");
        	food.add("Carrots");
        	food.add("Bell Peppers");
        	food.add("Avocados");

        }
        else if (userProfile.workoutPreference.equals("balance") && userProfile.foodRestriction.equals("vegan")) {
        	food.add("Spinach");
        	food.add("Kale");
        	food.add("Swiss Chard");
        	food.add("Broccoli");
        	food.add("Avocados");
        	food.add("Sweet Potatoes");
        	food.add("Quinoa");
        	food.add("Oats");
        	food.add("Brown Rice");
        	food.add("Berries");
        	food.add("Bananas");
        	food.add("Oranges");
        	food.add("Beets");
        	food.add("Carrots");
        	food.add("Bell Peppers");
        	food.add("Tomatoes");
        	food.add("Cucumbers");
        	food.add("Lentils");
        	food.add("Chickpeas");
        	food.add("Black Beans");
        	food.add("Kidney Beans");
        	food.add("Tofu");
        	food.add("Tempeh");
        	food.add("Edamame");
        	food.add("Chia Seeds");
        	food.add("Flaxseeds");
        	food.add("Pumpkin Seeds");
        	food.add("Almonds");
        	food.add("Walnuts");

        }
        else if (userProfile.workoutPreference.equals("balance") && userProfile.foodRestriction.equals("pescatarian")) {
        	food.add("Salmon");
        	food.add("Tuna");
        	food.add("Shrimp");
        	food.add("Crab");
        	food.add("Lobster");
        	food.add("Spinach");
        	food.add("Kale");
        	food.add("Swiss Chard");
        	food.add("Broccoli");
        	food.add("Avocados");
        	food.add("Sweet Potatoes");
        	food.add("Quinoa");
        	food.add("Oats");
        	food.add("Brown Rice");
        	food.add("Berries");
        	food.add("Bananas");
        	food.add("Oranges");
        	food.add("Beets");
        	food.add("Carrots");
        	food.add("Bell Peppers");
        	food.add("Tomatoes");
        	food.add("Cucumbers");
        	food.add("Chia Seeds");
        	food.add("Flaxseeds");
        	food.add("Almonds");
        	food.add("Walnuts");

        }
        
        
        
        

        // Handle restrictions/injuries
        
        
        if ("lactose".equals(userProfile.allergy)){
        	food.remove("Whole Milk");
        	food.remove("Regular Cheese");
        	food.remove("Cream");
        	food.remove("Butter");
        	food.remove("Almond Butter");
        	food.remove("Ice Cream");
        	food.remove("Yogurt");
        	food.remove("Greek Yogurt");
        	food.remove("Soft Cheeses ");
        	food.remove("Cottage Cheese");
        	food.remove("Milk Chocolate");
        	food.remove("Pudding ");
        	food.remove("Custard");

        }
        
        if ("nuts".equals(userProfile.allergy)){
        	food.remove("Almonds");
        	food.remove("Almonds Milk");
        	food.remove("Walnuts");
        	food.remove("Cashews");
        	food.remove("Pistachios");
        	food.remove("Pecans");
        	food.remove("Hazelnuts");
        	food.remove("Macadamia Nuts");
        	food.remove("Brazil Nuts");
        	food.remove("Pine Nuts");
        	food.remove("Chestnuts");
            food.remove("Flax Seeds");
            food.remove("Pumpkin Seeds");
            food.remove("Peanut Butter");
            food.remove("Almond Butter");
            food.remove("Sunflower Seeds");
            food.remove("Chia Seeds");
            food.remove("Hemp Seeds");

            

        }
        
        if ("gluten".equals(userProfile.allergy)){
        	food.remove("Wheat");
        	food.remove("Barley");
        	food.remove("Rye");
        	food.remove("Spelt");
        	food.remove("Bulgur");
        	food.remove("Farro");
        	food.remove("Kamut");
        	food.remove("Triticale");
        	food.remove("Whole Wheat Bread");
        	food.remove("White Bread");

        }

        // Create and return the workout plan
        return new FoodPlan(food);
    }

}
