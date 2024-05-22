package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Microwave {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int T = Integer.parseInt(input);

        int A = T / 300;
        T %= 300;

        int B = T / 60;
        T %= 60;

        int C = T / 10;
        T %= 10;

        if(T != 0) {
            System.out.println(-1);
        } else {
            System.out.println(A+" "+B+" "+C);
        }
    }
}
