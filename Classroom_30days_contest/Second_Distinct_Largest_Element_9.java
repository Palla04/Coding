import java.util.Scanner;

public class Second_Distinct_Largest_Element_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        // Initialize largest and second largest
        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                // new largest found
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                // arr[i] is between secondLargest and largest
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Long.MIN_VALUE) {
            System.out.println("NO");
        } else {
            System.out.println(secondLargest);
        }

        sc.close();
    }
}
