import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]); 
        int S = Integer.parseInt(firstLine[1]);
        int R = Integer.parseInt(firstLine[2]);
        

        String[] damagedLine = br.readLine().split(" ");
        HashSet<Integer> damaged = new HashSet<>();
        for (int i = 0; i < S; i++) {
            damaged.add(Integer.parseInt(damagedLine[i]));
        }
        

        String[] reserveLine = br.readLine().split(" ");
        HashSet<Integer> reserve = new HashSet<>();
        for (int i = 0; i < R; i++) {
            int team = Integer.parseInt(reserveLine[i]);
            if (damaged.contains(team)) {

                damaged.remove(team);
            } else {
                reserve.add(team);
            }
        }
        

        for (int team : reserve) {
            if (damaged.contains(team - 1)) {
                damaged.remove(team - 1);
            } else if (damaged.contains(team + 1)) {
                damaged.remove(team + 1);
            }
        }
        

        System.out.println(damaged.size());
    }
}
