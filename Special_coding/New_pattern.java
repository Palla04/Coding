import java.util.ArrayList;
import java.util.Scanner;

public class New_pattern {
    public ArrayList<Integer> printPat(int n) {
        // write code here
        ArrayList<Integer> result = new ArrayList<>();
        for(int row=n;row>=1;row--){
            for(int num=n;num>=1;num--){
                for(int p=1;p<=row;p++){
                    result.add(num);
                }
            }
            result.add(-1);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        New_pattern obj = new New_pattern();
        ArrayList<Integer> result = obj.printPat(n);
        System.out.println(result);
    }
}
