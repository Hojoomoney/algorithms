package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        int start = 0, count = 0, end = 0;
        while (true){
            if (sum >= M){
                sum -= numbers[start++];
            } else if (end == N){
                break;
            } else {
                sum += numbers[end++];
            }
            if (sum == M){
                count++;
            }
        }
        System.out.println(count);
    }
}
