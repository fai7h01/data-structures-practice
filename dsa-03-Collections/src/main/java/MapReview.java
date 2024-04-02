import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {

        // create hash map
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julian");

        String str = "JJava_Developer";
        System.out.println(findFirstNonRepeatingChar(str));


    }

    public static Character findFirstNonRepeatingChar(String str){
        Map<Character,Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }else{
                map.put(c, 1);
            }
        }

        for (char c : str.toCharArray()) {
            if (map.get(c) == 1){
                return c;
            }
        }

        return null;
    }
}
