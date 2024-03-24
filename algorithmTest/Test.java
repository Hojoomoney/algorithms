package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(number));
    }
    static int fibonacci(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
