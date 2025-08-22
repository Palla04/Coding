import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Monsters_vs_Heros_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int Q = sc.nextInt(); 

        int[][] monsters = new int[N][3];
        for (int i = 0; i < N; i++) {
            monsters[i][0] = sc.nextInt(); 
            monsters[i][1] = sc.nextInt(); 
            monsters[i][2] = sc.nextInt(); 
        }
        int[][] heroes = new int[Q][2];
        Set<Integer> heroPositions = new HashSet<>();
        for (int i = 0; i < Q; i++) {
            heroes[i][0] = sc.nextInt(); 
            heroes[i][1] = sc.nextInt(); 
            heroPositions.add(heroes[i][0]);
        }

        Map<Integer, List<Integer>> monstersAtPos = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int l = monsters[i][0], r = monsters[i][1], s = monsters[i][2];
            for (int pos : heroPositions) {
                if (pos >= l && pos <= r) {
                    monstersAtPos.computeIfAbsent(pos, k -> new ArrayList<>()).add(s);
                }
            }
        }

        long total = 0;
        for (int i = 0; i < N; i++) {
            total += (monsters[i][1] - monsters[i][0] + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int pos = heroes[i][0], power = heroes[i][1];
            List<Integer> list = monstersAtPos.getOrDefault(pos, new ArrayList<>());
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int strength = it.next();
                if (strength < power) {
                    total--; 
                    it.remove();
                }
            }
            sb.append(total).append(" ");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }    
}
