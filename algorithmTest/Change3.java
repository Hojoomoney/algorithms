package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int count = 0;
        while(true) {
            if(money % 5 == 0) {
                count += money/5;
                System.out.println(count);
                break;
            } else {
                money -= 2;
                count++;
            }
            if(money < 0){
                System.out.println(-1);
                break;
            }
        }


    }
}
