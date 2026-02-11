import java.util.ArrayList;

public class StudentListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store student names
        ArrayList<String> students = new ArrayList<>();

        // Add 10 student names
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eva");
        students.add("Frank");
        students.add("Grace");
        students.add("Hannah");
        students.add("Ian");
        students.add("Julia");

        // Display all student names using a basic for loop
        System.out.println("List of Students:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
