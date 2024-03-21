package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        //1152 단어 개수 세기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        //StringTokenizer는 디폴트로 공백기준으로 구분해줌
        StringTokenizer st = new StringTokenizer(sentence);
        //countTokens 문자개수를 바로 리턴해준다.
        System.out.println(st.countTokens());
    }
}
