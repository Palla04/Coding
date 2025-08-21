import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Special_Calculator_28 {
    public static int minSteps(int A, int B) {
        
        boolean[] visited = new boolean[101];
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[]{A, 0});
        visited[A] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentNumber = current[0];
            int steps = current[1];
         
            if (currentNumber == B) {
                return steps;
            }
    
            int nextPlus3 = currentNumber + 3;
            if (nextPlus3 <= 100 && !visited[nextPlus3]) {
                queue.add(new int[]{nextPlus3, steps + 1});
                visited[nextPlus3] = true;
            }
            
            int nextMinus2 = currentNumber - 2;
            
            if (nextMinus2 >= 1 && !visited[nextMinus2]) {
                queue.add(new int[]{nextMinus2, steps + 1});
                visited[nextMinus2] = true;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        System.out.println(minSteps(A, B));
        
        scanner.close();
    }
}
