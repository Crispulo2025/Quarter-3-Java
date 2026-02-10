import java.util.*;

public class ReverseListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Collections.reverse(numbers);

        System.out.println(numbers);
    }
}
