public class Rotate_string {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        String res = s + s;
        return res.contains(goal);
    }

    public static void main(String[] args) {
        Rotate_string sol = new Rotate_string();

        // Test cases
        String s1 = "abcde";
        String goal1 = "cdeab";

        String s2 = "abcde";
        String goal2 = "abced";

        System.out.println(sol.rotateString(s1, goal1)); // true
        System.out.println(sol.rotateString(s2, goal2)); // false
    }
}
