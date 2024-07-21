package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Blobnom {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = Math.max(arr[0], arr[N - 1]);
        for (int i = 1; i < N - 1; i++) {
            max = Math.max(max, arr[i] + Math.min(arr[i - 1], arr[i + 1]));
        }
        System.out.println(max);
    }
}
