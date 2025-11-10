import java.util.Scanner;
import java.util.Stack;

public class Balanced_Parentheses_Check_13 {
    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) return false; // closing without opening
                char top = st.pop();
                if (!matches(top, ch)) return false; // mismatch
            }
            // ignore other characters (optional). If you want to reject non-bracket chars, handle here.
        }
        return st.isEmpty(); // all opened brackets must be closed
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')')
            || (open == '{' && close == '}')
            || (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check:");
        String input = sc.nextLine();
        boolean balanced = isBalanced(input.trim());
        if (balanced) System.out.println("Balanced");
        else System.out.println("Not Balanced");
        sc.close();
    }

}
