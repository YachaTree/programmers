import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String vowels = "aeiouAEIOU";
        String input;
        
        while(!(input = br.readLine()).equals("#")) {
            int count = 0;
            for(int i = 0; i < input.length(); i++) {
                if(vowels.indexOf(input.charAt(i)) != -1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}