import java.util.Scanner;

public class Chocolate_game_26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();
        long steps = 0;
        while (a > 0 && b > 0) {
            if (a >= b) {
                steps += a / b;  
                a %= b;
            } else {
                steps += b / a;  
                b %= a;
            }
        }

        System.out.println(steps);
    }
}