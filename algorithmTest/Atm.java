package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Atm {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // StringTokenizer 객체 선언
        // "1 3 5 7" 식으로 공란 포함 String Line일시 StringTokenizer 이용
        int[] minutes = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            // 배열에다 토큰을 하나씩 불러서 입력해줌
            minutes[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(minutes);
        int minSum = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp += minutes[i];
            minSum += temp;
        }
        System.out.println(minSum);
    }
}
