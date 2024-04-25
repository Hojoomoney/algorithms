package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Election {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] votes = new int[n];
        for (int i = 0; i < n; i++) {
            votes[i] = Integer.parseInt(br.readLine());
        }
        int dasom = votes[0];
        int count = 0;
        for (int i = 1; i < votes.length; i++) {
            int compare = votes[i];
            while (true){
                 if(dasom <= compare){
                    compare--;
                    dasom++;
                    count++;
                } else {
                     break;
                 }
            }
        }
        System.out.println(count);
    }
}
