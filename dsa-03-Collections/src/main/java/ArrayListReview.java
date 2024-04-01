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
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Backwards Iteration
        System.out.println("Printing backwards with iterator.......");
        while(((ListIterator<?>) iterator).hasPrevious()){
            System.out.println(((ListIterator<?>) iterator).previous());
        }

        // 3. for each
        System.out.println("Printing with for each loop.......");

        for (Student each : students) {
            System.out.println(each);
        }

        // 4. Lambda
        System.out.println("Printing with forEach method.......");
        students.forEach(System.out::println);


        // Sorting Elements in List using comparator interface
        System.out.println("Sorting with comparator interface descending order");
        Collections.sort(students, new SortByDescending());
        System.out.println(students);

        Collections.sort(students, new SortByNameDescending());
        System.out.println(students);


    }
    //  implementations of  Comparator

    static class SortByDescending implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }

    static class SortByNameDescending implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }

}
