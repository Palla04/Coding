import java.util.Scanner;

public class Atoi_String_to_Integer {
    public int myAtoi(String s){
        s = s.trim();
        if(s.length() == 0) return 0;

        long res=0;
        int sign=1;
        int i=0;

        if(s.charAt(0) == '-'){
            sign = -1;
            i++;
        } else if(s.charAt(0) == '+'){
            i++;
        }

        while(i<s.length()){
            char ch = s.charAt(i);

            if(ch < '0' || ch > '9'){
                break;
            }
            res = res * 10 + (ch - '0');
            i++;
        }
        res = res * sign;
        return (int) res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to convert to integer: ");
        String s = sc.nextLine();
        Atoi_String_to_Integer obj = new Atoi_String_to_Integer();
        int result = obj.myAtoi(s);
        System.out.println("Converted Integer: " + result);
    }
}
