package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class isContains {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if(str == null) break;

            st = new StringTokenizer(str);

            String s = st.nextToken();
            String t = st.nextToken();
            if (t.contains(s)) {
                System.out.println("Yes");
                return;
            }
            boolean isContain = true;
            int compare = -1;
            for (int i = 0; i < s.length(); i++) {
                int index = t.indexOf(s.charAt(i));
                if (index == -1) {
                    isContain = false;
                }
                if (index > compare) {
                    compare = index;
                } else {
                    isContain = false;
                }
            }
            if (isContain == true) {
                sb.append("Yes").append('\n');
            } else {
                sb.append("No").append('\n');
            }


        }
        System.out.println(sb);

    }
}
