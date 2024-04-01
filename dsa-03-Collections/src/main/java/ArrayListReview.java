import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create ArrayList and a class
        List<Student> students = new ArrayList<>();

        // Add elements to ArrayList
        students.add(new Student(1,"Melissa"));
        students.add(new Student(2,"Julian"));
        students.add(new Student(3,"Selena"));
        students.add(new Student(4,"Yin"));


        // Iteration on ArrayLists
        // 1. For Loop with get(index)
        System.out.println("Printing with legacy for-loop.......");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        // 2. Iterator
        // Forward Iteration
        System.out.println("Printing with iterator.......");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Backwards Iteration


        // 3. for each loop

        // 4. Lambda


        // Sorting Elements in List using comparator interface


    }
    //  implementations of  Comparator

}
