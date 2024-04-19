package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Radio {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int[] buttons = new int[n];
        for (int i = 0; i < n; i++) {
            buttons[i] = Integer.parseInt(br.readLine());
        }
        int min = Math.abs(B-A);
        boolean notInFav = true;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(B - buttons[i]);
            if(min > diff){
                min = diff;
                notInFav = false;
            }
        }

        if(notInFav){
            System.out.println(min);
        } else {
            System.out.println(min + 1);
        }
    }
}
