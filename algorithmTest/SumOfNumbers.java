package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        long n = 1,sum = 0;
        while (sum < s){
            sum+=n;
            if (sum > s) break;
            n++;
        }
        System.out.println(n-1);
    }
}
