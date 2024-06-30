package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class CowStreet3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] check = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            check[i][0] = Integer.parseInt(st.nextToken());
            check[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(check, Comparator.comparingInt(o -> o[0]));

        int sum = check[0][0] + check[0][1];
        for (int i = 1; i < N; i++) {
            if(check[i][0] > sum){
                sum += check[i][0] - sum;
            }
            sum += check[i][1];
        }
        System.out.println(sum);

    }
}
