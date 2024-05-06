package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Antenna {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] houses = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            houses[i] = Integer.parseInt(st.nextToken());
        }
        int min = Integer.MAX_VALUE;
        int loc = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    sum += Math.abs(houses[i] - houses[j]);
                }
            }
            min = Math.min(min,sum);
            if (min == sum){
                loc = Math.min(loc,houses[i]);
            }
        }
        System.out.println(loc);
    }

}
