import java.util.Scanner;

public class Happy_Number{

    static int sumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;

        while (temp != 1 && temp != 4) {
            temp = sumOfSquares(temp);
        }

        if (temp == 1)
            System.out.println(num + " is a Happy Number.");
        else
            System.out.println(num + " is not a Happy Number.");

        sc.close();
    }
}