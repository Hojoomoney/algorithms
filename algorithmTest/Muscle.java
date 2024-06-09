package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Muscle {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] muscles = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            muscles[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(muscles);
        long max = 0;
        if(N % 2 == 0){
            for (int i = 0; i < N/2; i++) {
                max = Math.max(max, muscles[i] + muscles[N-1-i]);
            }
        } else {
            max = muscles[N-1];
            for (int i = 0; i < (N-1)/2; i++) {
                max = Math.max(max, muscles[i] + muscles[N-2-i]);
            }
        }
        System.out.println(max);
    }
}
