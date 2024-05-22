package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Apple {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int J = Integer.parseInt(br.readLine());
        int start = 1;
        int end = M;
        int count = 0;
        for (int i = 0; i < J; i++) {
            int apple = Integer.parseInt(br.readLine());
            if (apple < start){
                count += start - apple;
                start = apple;
                end = apple + M - 1;
            } else if (apple > end){
                count += apple - end;
                end = apple;
                start = apple - M + 1;
            }
        }
        System.out.println(count);

    }
}
