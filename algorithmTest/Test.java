package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       List<Integer> list = new ArrayList<>(1000);
        int count = 1;
        while (list.size() < 1000){
            for (int i = 0; i < count; i++) {
                    list.add(count);
            }
            count++;
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i = num1-1; i < num2; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}