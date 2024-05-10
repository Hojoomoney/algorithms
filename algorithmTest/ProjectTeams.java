package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ProjectTeams {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ability = new int[2 * n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2 * n; i++) {
            ability[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ability);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ability.length/2; i++) {
            int sum = ability[i] + ability[ability.length - 1 - i];
            min = Math.min(min, sum);
        }
        System.out.println(min);

    }
}
