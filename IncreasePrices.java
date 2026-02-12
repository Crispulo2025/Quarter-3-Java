import java.util.ArrayList;
import java.util.ListIterator;

public class IncreasePrices {
    public static void main(String[] args) {
        // Create an ArrayList of Double prices
        ArrayList<Double> prices = new ArrayList<>();
        
        // Add sample prices
        prices.add(100.0);
        prices.add(50.5);
        prices.add(200.75);
        prices.add(80.25);

        System.out.println("Original prices: " + prices);

        // Use a ListIterator to increase each price by 10%
        ListIterator<Double> iterator = prices.listIterator();
        while (iterator.hasNext()) {
            double currentPrice = iterator.next();
            double updatedPrice = currentPrice * 1.10; // Increase by 10%
            iterator.set(updatedPrice); // Update the element in the list
        }

        System.out.println("Updated prices (+10%): " + prices);
    }
}
