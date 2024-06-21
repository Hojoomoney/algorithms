package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ranking {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ranks = new int[N];
        for (int i = 0; i < N; i++) {
            ranks[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ranks);
        long dissatisfaction = 0;
        for (int i = 0; i < N; i++) {
            dissatisfaction += Math.abs(ranks[i] - (i + 1));
        }
        System.out.println(dissatisfaction);

    }
}
