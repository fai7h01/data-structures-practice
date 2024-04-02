import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {

        //1. create a set
        Set<Student> set = new LinkedHashSet<>();

        set.add(new Student(1,"Melissa"));
        set.add(new Student(2,"Julian"));
        set.add(new Student(3,"Selena"));
        set.add(new Student(4,"Yin"));
        System.out.println(set.add(new Student(4, "Yin")));

        System.out.println(set);

        System.out.println("-------------------------------------------");

        System.out.println(firstRepeatingChar("Java Developer"));


    }

    public static Character firstRepeatingChar(String str){
        Set<Character> set = new HashSet<>();
        // space complexity O(n)

        for (char ch :str.toCharArray()) if (!set.add(ch)) return ch;
        // time complexity O(n)

        return null;
    }

}
