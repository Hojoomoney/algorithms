package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CatCafe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int catCount = Integer.parseInt(st.nextToken());
        int maxWeight = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] catsWeight = new int[catCount];
        for (int i = 0; i < catCount; i++) {
            catsWeight[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(catsWeight);
        int count = 0;
            for (int i = 0; i < catCount; i++) {
                int temp = 0;
                for (int j = catCount-1; j > i; j--) {
                    if (catsWeight[i] + catsWeight[j] <= maxWeight) {
                        count++;
                        catCount = catCount - 1 - temp;
                        break;
                    }
                    temp++;
                }
            }
        System.out.println(count);
    }
}
