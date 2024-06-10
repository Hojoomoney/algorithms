package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bother {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] lengths = new long[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            lengths[i] = Long.parseLong(st.nextToken());
            sum += lengths[i];
        }
        long result = 0;
        for (int i = 0; i < N; i++) {
            result += lengths[i] * (sum - lengths[i]);
            sum -= lengths[i];
        }
        System.out.println(result);
    }
}
