import java.util.Scanner;

public class Sort_Char_by_freq {
    public String frequencySort(String s) {
        
        int[] freq = new int[256];
        String result = "";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }

        for(int f=s.length();f>=1;f--){
            for(int i=0;i<256;i++){
               if(freq[i] == f){
                    for (int k = 0; k < f; k++) {
                        result += (char) i;
                    }
               }
            }
            
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        // String s = "Classroom";
        Sort_Char_by_freq obj = new Sort_Char_by_freq();
        String res = obj.frequencySort(s);
        System.out.println(res);
    }
}
