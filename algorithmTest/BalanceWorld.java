package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalanceWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            int leftRoundBracket = 0;
            int leftSquareBracket = 0;
            int rightRoundBracket = 0;
            int rightSquareBracket = 0;
            String input = br.readLine();
            if(input.equals(".")){
                break;
            }
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if(c == '('){
                    leftRoundBracket++;
                }else if(c == ')'){
                    rightRoundBracket++;
                }else if(c == '['){
                    leftSquareBracket++;
                }else if(c == ']'){
                    rightSquareBracket++;
                }
                if(rightRoundBracket > leftRoundBracket || rightSquareBracket > leftSquareBracket){
                    sb.append("no\n");
                    break;
                }
                if (i == input.length()-1){
                    if(leftRoundBracket == rightRoundBracket && leftSquareBracket == rightSquareBracket){
                        sb.append("yes\n");
                    }else{
                        sb.append("no\n");
                    }
                }
            }

        }
        System.out.println(sb);
    }
}
