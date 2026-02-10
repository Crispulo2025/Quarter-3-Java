import java.util.*;

public class IteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer n = iterator.next();
            if (n % 2 == 0) {
                iterator.remove(); // ✅ Safe removal
            }
        }

        System.out.println(numbers);
    }
}
