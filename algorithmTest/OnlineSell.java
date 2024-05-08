package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class OnlineSell {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Integer[] P = new Integer[M];
        for (int i = 0; i < M; i++) {
            P[i] = Integer.parseInt(br.readLine());
        }
        if(N > M) N=M;

        Arrays.sort(P,Collections.reverseOrder());
        int max = 0;
        int price = 0;
        for (int i = 0; i < N; i++) {
            int sum = P[i] * (i+1);
            max = Math.max(max, sum);
            if (max == sum) price = P[i];
        }
        System.out.println(price + " " + max);

    }
}
