package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Candy {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 0;
        StringTokenizer st;
        int[] results = new int[n];
        while (i < n){
            st = new StringTokenizer(br.readLine());
            int countCandies = Integer.parseInt(st.nextToken());
            int countBoxes = Integer.parseInt(st.nextToken());
            Integer[] candies = new Integer[countBoxes];
            for (int j = 0; j < countBoxes; j++) {
                st = new StringTokenizer(br.readLine());
                candies[j] = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            }
            Arrays.sort(candies, Collections.reverseOrder());
            int sum = 0;
            int count = 0;
            for (int j = 0; j < candies.length; j++) {
                sum += candies[j];
                count++;
                if(sum >= countCandies){
                    results[i] = count;
                    break;
                }
            }
            i++;
        }
        for (int j = 0; j < results.length; j++) {
            System.out.println(results[j]);
        }
    }
}
