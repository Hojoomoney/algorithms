package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PartTimeWorker {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] tips = new Integer[N];
        for (int i = 0; i < N; i++) {
            tips[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(tips, (o1, o2) -> o2 - o1);
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if(tips[i] - i < 1) break;
            sum += tips[i] - i;
        }
        System.out.println(sum);
    }
}
