package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CowBurger {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int burgerCount = Integer.parseInt(st.nextToken());
        int sideCount = Integer.parseInt(st.nextToken());
        int drinkCount = Integer.parseInt(st.nextToken());
        int minCount = Math.min(burgerCount, Math.min(sideCount, drinkCount));
        int sumBeforeDiscount = 0;
        st = new StringTokenizer(br.readLine());
        Integer[] burgerPrices = new Integer[burgerCount];
        for (int i = 0; i < burgerCount; i++) {
            burgerPrices[i] = Integer.parseInt(st.nextToken());
            sumBeforeDiscount += burgerPrices[i];
        }
        st = new StringTokenizer(br.readLine());
        Integer[] sidePrices = new Integer[sideCount];
        for (int i = 0; i < sideCount; i++) {
            sidePrices[i] = Integer.parseInt(st.nextToken());
            sumBeforeDiscount += sidePrices[i];
        }
        st = new StringTokenizer(br.readLine());
        Integer[] drinkPrices = new Integer[drinkCount];
        for (int i = 0; i < drinkCount; i++) {
            drinkPrices[i] = Integer.parseInt(st.nextToken());
            sumBeforeDiscount += drinkPrices[i];
        }
        int sumAfterDiscount = sumBeforeDiscount;
        Arrays.sort(burgerPrices, (o1, o2) -> o2 - o1);
        Arrays.sort(sidePrices, (o1, o2) -> o2 - o1);
        Arrays.sort(drinkPrices, (o1, o2) -> o2 - o1);

        for (int i = 0; i < minCount; i++) {
            sumAfterDiscount -= (int) ((burgerPrices[i] + sidePrices[i] + drinkPrices[i]) * 0.1);
        }
        System.out.println(sumBeforeDiscount);
        System.out.println(sumAfterDiscount);
    }
}
