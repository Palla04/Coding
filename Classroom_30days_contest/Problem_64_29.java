import java.util.Scanner;
public class Problem_64_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        
        int result = 0;
        for (int i = 0; i < N; i++) {
            int num = L[i];
            int small = 9;
            
            if (num == 0) {
                small = 0;
            } else {
                while (num > 0) {
                    int digit = num % 10;     
                    if (digit < small) {
                        small = digit;        
                    }
                    num /= 10;                
                }
            }
            result += small;  
        }
        
        System.out.println(result);

    }
}
