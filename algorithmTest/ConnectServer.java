package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConnectServer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String regEx = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
              if (br.readLine().matches(regEx.replace("*", ".*"))) {
                sb.append("DA\n");
              } else {
                sb.append("NE\n");
              }
        }
        System.out.println(sb);
    }
}
