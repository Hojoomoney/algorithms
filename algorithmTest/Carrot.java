package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Carrot {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Integer.parseInt(st.nextToken());
        long Y = Integer.parseInt(st.nextToken());
        if (X > Y) System.out.println(X+Y/10 + Y);
        else System.out.println(Y+X/10 + X);

    }
}
