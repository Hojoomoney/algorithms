import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        char word = str.charAt(0);
        sb.append(word);
        for (int i = 1; i < str.length(); i++) {
            if (word != str.charAt(i)) {
                word = str.charAt(i);
                sb.append(word);
            }
        }
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {
                count0++;
            }
            if (sb.charAt(i) == '1') {
                count1++;
            }
        }
        System.out.println(Math.min(count0, count1));

    }
}
