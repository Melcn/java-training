package MOOCFI2.Part6.ObjectListandListObject.Menu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }

    }

    public void printMeals() {
        for (String m : meals
        ) {
            System.out.println(m);
        }
    }

    public void clearMenu() {
        for (String m : meals
        ) {
            meals.remove(m);
        }

    }
}
