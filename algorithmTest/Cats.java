package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cats {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        if (N == 0) {
            System.out.println(0);
            return;
        }
        if (N == 1){
            System.out.println(1);
            return;
        }
        if (N == 2) {
            System.out.println(2);
            return;
        }

        int count = 2;
        long a = 2;
        while(N > a) {
            a *= 2;
            count++;
        }
        System.out.println(count);
    }
}
