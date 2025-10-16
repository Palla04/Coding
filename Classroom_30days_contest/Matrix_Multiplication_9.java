import java.util.Scanner;

public class Matrix_Multiplication_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        
        int[][] m1 = new int[n][m];
        int[][] m2 = new int[m][r];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                m1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<r;j++){
                m2[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<r;j++){
                int sum = 0;
                for(int k=0;k<m;k++){
                    sum += m1[i][k] * m2[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
