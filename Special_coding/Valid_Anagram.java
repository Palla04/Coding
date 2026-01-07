import java.util.Scanner;
import java.util.Arrays;

public class Valid_Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings");
        System.out.print("S :");
        String s = sc.nextLine();
        System.out.print("T :");
        String t = sc.nextLine();
        Valid_Anagram obj = new Valid_Anagram();
        boolean res = obj.isAnagram(s, t);
        System.out.println(res);
    }
    public boolean isAnagram(String s, String t) {
        int freq1[] = new int[256];
        int freq2[] = new int[256];

        if(s.length()!= t.length()){
            return false;
        }
        
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            freq1[ch]++;
        }
        for(int i=0; i<t.length();i++){
            char ch = t.charAt(i);
            freq2[ch]++;
        }

        if(Arrays.equals(freq1, freq2))
           return true;

        return false;
    }
}
