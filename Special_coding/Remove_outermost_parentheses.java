import java.util.Scanner;

public class Remove_outermost_parentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        if (ch == '(') {
            if (count > 0) {
                result.append(ch);
            }
            count++;
        } else { // ')'
            count--;
            if (count > 0) {
                result.append(ch);
            }
        }
    }

    return result.toString();
    }

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();

        Remove_outermost_parentheses obj = new Remove_outermost_parentheses();
        String output = obj.removeOuterParentheses(s);

        System.out.println("Result after removing outer parentheses: " + output);

        sc.close();
    }
}


