package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bracket {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 30-70-20+40-10+100+30-35
        String numbers = br.readLine();
        StringTokenizer st = new StringTokenizer(numbers, "-");
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()){
            String plus = st.nextToken();
            if(plus.contains("+")){
                int sum = 0;
                StringTokenizer stPlus = new StringTokenizer(plus, "+");
                while (stPlus.hasMoreTokens()){
                    sum += Integer.parseInt(stPlus.nextToken());
                }
                sb.append(sum).append("-");
            } else {
                sb.append(plus).append("-");
            }
        }
        StringTokenizer stMinus = new StringTokenizer(sb.toString(), "-");
        int min = Integer.parseInt(stMinus.nextToken());
        while (stMinus.hasMoreTokens()){
            min -= Integer.parseInt(stMinus.nextToken());
        }
        System.out.println(min);
    }
}
