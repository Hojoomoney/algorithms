package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalculateDate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int E = 0, S = 0, M = 0, year = 0;
        while (!(e == E && s == S && m == M)){
            year++;
            E++;
            S++;
            M++;
            if (E == 16) E = 1;
            if (S == 29) S = 1;
            if (M == 20) M = 1;
        }
        System.out.println(year);
    }
}
