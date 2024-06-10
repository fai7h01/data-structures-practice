package review;

import java.util.Collection;

public class FastStackTestApp {
    public static void main(String[] args) {

        FastStack<Integer> stack = new FastStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.print();




    }



}
