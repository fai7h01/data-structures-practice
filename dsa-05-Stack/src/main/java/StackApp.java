
public class StackApp {
    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();

        for (int i = 5; i <= 50; i+=5) {
            stack.push(i);
        }

        stack.print();
        stack.push(55);
        stack.print();
        System.out.println("peek " + stack.peek());
        stack.print();
        System.out.println("pop " + stack.pop());
        stack.print();
        System.out.println(stack.size);

        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }

        System.out.println(stack.isEmpty());

    }
}
