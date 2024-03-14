package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BulbSwitch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] bulbs1 = new int[n]; // 첫번째 전구를 켰을때
        int[] bulbs2 = new int[n]; // 첫번째 전구를 안켰을때
        int[] ends = new int[n]; //최종
        String bulbs = br.readLine();
        String end = br.readLine();
        int bulbs1Count = 1, bulbs2Count = 0, notExist = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            bulbs1[i] = bulbs.charAt(i) - '0';
            bulbs2[i] = bulbs.charAt(i) - '0';
            ends[i] = end.charAt(i) - '0';
        }
        bulbs1[0] = 1 - bulbs1[0];
        bulbs1[1] = 1 - bulbs1[1];
        for (int i = 1; i < n; i++) {

            // 첫번째 전구를 켰을때 비교
            if(bulbs1[i-1] != ends[i-1]){
                bulbs1[i-1] = 1 - bulbs1[i-1];
                bulbs1[i] = 1 - bulbs1[i];
                if(i != n-1){
                    bulbs1[i+1] = 1 - bulbs1[i+1];
                }
                bulbs1Count++;
            }
            // 첫번째 전구를 안켰을때 비교
            if(bulbs2[i-1] != ends[i-1]){
                bulbs2[i-1] = 1 - bulbs2[i-1];
                bulbs2[i] = 1 - bulbs2[i];
                if(i != n-1){
                    bulbs2[i+1] = 1 - bulbs2[i+1];
                }
                bulbs2Count++;
            }
        }
        if(bulbs1[n-1] != ends[n-1]) bulbs1Count = notExist;
        if(bulbs2[n-1] != ends[n-1]) bulbs2Count = notExist;
        if(bulbs1Count == notExist && bulbs2Count == notExist){
            System.out.println(-1);
        } else {
            System.out.println(Math.min(bulbs1Count,bulbs2Count));
        }
    }
}
