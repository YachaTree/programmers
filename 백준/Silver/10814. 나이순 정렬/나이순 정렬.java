import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Member implements Comparable<Member> {
    int age;
    String name;
    int joinOrder;

    public Member(int age, String name, int joinOrder) {
        this.age = age;
        this.name = name;
        this.joinOrder = joinOrder;
    }

    @Override
    public int compareTo(Member other) {
        if (this.age == other.age) {
            return this.joinOrder - other.joinOrder;
        } else {
            return this.age - other.age;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Member[] members = new Member[N];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members[i] = new Member(age, name, i);
        }
        
        Arrays.sort(members);
        
        StringBuilder sb = new StringBuilder();
        for (Member m : members) {
            sb.append(m.age).append(" ").append(m.name).append("\n");
        }
        
        System.out.println(sb);
    }
}
