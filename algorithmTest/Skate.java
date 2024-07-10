package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Skate {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long sum = 0;
        long j = 1;
        for (int i = arr.length -1; i >= 0; i--){
            if (arr[i] < j) {
                j = arr[i];
            }
            sum += j;
            j++;
        }
        System.out.println(sum);
    }
}
