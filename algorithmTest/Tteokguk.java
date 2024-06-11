package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Tteokguk {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] bowls = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            bowls[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(bowls);
        int result = 1;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (bowls[i] == bowls[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            result = Math.max(result, count);
        }
        System.out.println(result);
    }
}
