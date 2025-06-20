import java.util.Scanner;
import java.util.Stack;
public class ValidParentheses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(stack.isEmpty());
        input.close();
    }
}
