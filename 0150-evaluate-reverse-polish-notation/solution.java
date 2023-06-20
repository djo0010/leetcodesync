import java.util.Stack;

class Solution {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> myStack = new Stack<>();
        for (String token : tokens) {
            char item = token.charAt(0);
            if (token.matches("-?\\d+(\\.\\d+)?")) myStack.push(Integer.parseInt(token));
            else {
                int first = 0;
                int second = 0;
                int res = 0;
                switch (item) {
                    case '+':
                        res += myStack.pop() + myStack.pop();
                        break;
                    case '-':
                        first = myStack.pop();
                        second = myStack.pop();
                        res += second - first;
                        break;
                    case '*':
                        res += myStack.pop() * myStack.pop();
                        break;
                    case '/':
                        first = myStack.pop();
                        second = myStack.pop();
                        res += second / first;
                        break;
                }
                myStack.push(res);
            }
        }
        return myStack.pop();
    }
}
