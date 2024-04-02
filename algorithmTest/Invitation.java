package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Invitation {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int count = 2;
        Integer[] arr = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            max = Math.max(max,Integer.parseInt(st.nextToken()) + count);
            count++;
        }
        System.out.println(max);
    }
}
