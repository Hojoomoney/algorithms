package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTest = Integer.parseInt(br.readLine());
        int[] results = new int[numTest];
        for (int i = 0; i < numTest; i++) {
            int[] numbers = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                numbers[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(numbers);
            results[i] = numbers[7];
        }
        for (int i = 0; i < numTest; i++) {
            System.out.println(results[i]);
        }
    }
}