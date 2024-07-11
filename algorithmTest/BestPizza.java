package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BestPizza {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int toppingCount = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int doughPrice = Integer.parseInt(st.nextToken());
        int toppingPrice = Integer.parseInt(st.nextToken());
        int doughCalorie = Integer.parseInt(br.readLine());
        Integer[] toppingCalories = new Integer[toppingCount];
        for (int i = 0; i < toppingCount; i++) {
            toppingCalories[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(toppingCalories, (o1, o2) -> o2 - o1);
        int sum = doughCalorie;
        int price = doughPrice;
        int max = doughCalorie / price;
        for (int i = 0; i < toppingCount; i++) {
            sum += toppingCalories[i];
            price += toppingPrice;
            int temp = sum / price;
            max = Math.max(max, sum / price);
            if (temp != max) {
                break;
            }
        }
        System.out.println(max);
    }
}
