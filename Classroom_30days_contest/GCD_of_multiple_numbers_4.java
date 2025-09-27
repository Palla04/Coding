import java.util.Scanner;

public class GCD_of_multiple_numbers_4 {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of elements
        long result = sc.nextLong(); // first element as initial gcd

        for (int i = 1; i < n; i++) {
            long num = sc.nextLong();
            result = gcd(result, num);  // gcd of current result and next number
        }

        sc.close();

        System.out.println(result);
    }
}
