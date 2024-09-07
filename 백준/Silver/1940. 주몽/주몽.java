import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int N = sc.nextInt(); // 재료의 개수
        int M = sc.nextInt(); // 갑옷을 만드는데 필요한 숫자
        int[] materials = new int[N]; // 재료들의 고유 번호
        
        // 재료 번호 입력
        for (int i = 0; i < N; i++) {
            materials[i] = sc.nextInt();
        }
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(materials);
        
        int left = 0; 
        int right = N - 1;
        int count = 0; 

        while (left < right) {
            int sum = materials[left] + materials[right];
            
            if (sum == M) {
                count++; // 갑옷을 만들 수 있는 경우
                left++;
                right--;
            } else if (sum < M) {
                left++; // 합이 M보다 작으면 왼쪽 포인터를 오른쪽으로 이동
            } else {
                right--; // 합이 M보다 크면 오른쪽 포인터를 왼쪽으로 이동
            }
        }
        
        System.out.println(count);
        
        sc.close();
    }
}
