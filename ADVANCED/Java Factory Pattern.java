import java.io.*;
import java.util.*;

interface Food {
    String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if (order.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (order.equalsIgnoreCase("cake")) {
            return new Cake();
        }
        return null;
    }
}

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String order = br.readLine();

        FoodFactory factory = new FoodFactory();
        Food food = factory.getFood(order);

        System.out.println("The factory returned class " + food.getClass().getSimpleName());
        System.out.println(food.getType());
    }
}
