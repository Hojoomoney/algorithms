package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupChecker {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            boolean[] check = new boolean[26];
            boolean isGroup = true;

            for (int j = 0; j < str.length(); j++) {
                if (check[str.charAt(j) - 'a']) {
                    isGroup = false;
                    break;
                }
                if (j < str.length() - 1 && str.charAt(j) != str.charAt(j + 1)) {
                    check[str.charAt(j) - 'a'] = true;
                }
            }
            if (isGroup) count++;
        }
        System.out.println(count);
    }
}
