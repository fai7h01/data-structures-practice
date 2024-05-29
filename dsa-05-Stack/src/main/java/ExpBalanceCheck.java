public class ExpBalanceCheck {
    public static void main(String[] args) {
        System.out.println(balanceCheck("(A*C)+{V-M}]"));
    }

    static boolean balanceCheck(String expr){
        // create a stack
        MyStack<Character> myStack = new MyStack<>();
        // iterate over expr
        for (int i = 0; i < expr.length(); i++) {
            Character ch = expr.charAt(i);
            //filter non player chars
            if (ch != '(' && ch != '[' && ch != '{' && ch != '}' && ch != ']' && ch != ')'){
                continue;
            }
            if (ch == '(' || ch == '[' || ch == '{'){
                myStack.push(ch);
                continue;
            }
            if (myStack.isEmpty()) return false;
            switch (ch){
                case ')':
                    if (myStack.pop() != '(') return false;
                    break;
                case ']':
                    if (myStack.pop() != '[') return false;
                    break;
                case '}':
                    if (myStack.pop() != '{') return false;
                    break;
            }
        }
        // return if stack is empty
        return myStack.isEmpty();
    }

}
