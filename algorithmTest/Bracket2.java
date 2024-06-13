package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bracket2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int leftBracket = 0;
        int rightBracket = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    leftBracket++;
                } else {
                    rightBracket++;
                }
                if (leftBracket < rightBracket) {
                    sb.append("NO\n");
                    break;
                }
                if (j == str.length() - 1) {
                    if (leftBracket == rightBracket) {
                        sb.append("YES\n");
                    } else {
                        sb.append("NO\n");
                    }
                }
            }
            leftBracket = 0;
            rightBracket = 0;
        }
        System.out.println(sb);

    }
}
