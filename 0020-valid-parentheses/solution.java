public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int countOfAdds = 0;
        int countOfPops = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                countOfAdds++;
            }
            else {
                char check = s.charAt(i);
                try {
                    switch (check) {
                        case '}':
                            if (stack.pop() != '{') return false;
                            break;
                        case ')':
                            if (stack.pop() != '(') return false;
                            break;
                        case ']':
                            if (stack.pop() != '[') return false;
                            break;
                    }
                    countOfPops++;
                }
                catch (Exception e) {
                    return false;
                }
                }
            }
        return countOfPops == countOfAdds;
    }
}
