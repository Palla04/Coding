import java.util.Scanner;

public class Depth_of_Parentheses {
    public int maxDepth(String s) {
        int count = 0;
        int MaxDep = 0;

        for (char c : s.toCharArray()){
             if(c == '('){
                count++;
                if(count > MaxDep){
                    MaxDep = count;
                }
             }
             else if(c == ')'){
                count--;
             }
        }
        return MaxDep;
    }
    
    public static void main(String[] args) {
        Depth_of_Parentheses obj = new Depth_of_Parentheses();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string with parentheses: ");
        // String s = "(1+(2*3)+((8)/4))+1";
        String s = sc.nextLine();
        int res = obj.maxDepth(s);
        System.out.println("Maximum Depth of Parentheses: " + res);
    }

}
