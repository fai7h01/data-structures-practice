import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetView {

    public static void main(String[] args) {

        int[] buildings = {3,5,4,4,3,1,3,2};
        System.out.println(sunsetView(buildings, "east"));

    }

    static ArrayList<Integer> sunsetView(int[] buildings, String direction){
        Stack<Integer> stack = new Stack<>();

        //this part is for east by default
        int index = 0;
        int step = 1;
        //this part is for west
        if (direction.equalsIgnoreCase("west")){
            index = buildings.length - 1;
            step = -1;
        }

        while (index >= 0 && index < buildings.length) {
            while (!stack.isEmpty() && buildings[index] >= buildings[stack.peek()]) {
                stack.pop();
            }
            stack.push(index);
            index += step;
        }
        //now i have a stack with building indices that can see sunset
        if (direction.equalsIgnoreCase("west")){
            Collections.reverse(stack);
        }

        return new ArrayList<>(stack);
    }

}
