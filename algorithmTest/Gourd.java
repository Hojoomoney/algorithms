package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gourd {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i=1;i<K+1;i++) {
            N-=i;
            if(N < 0) {
                sb.append(-1);
                break;
            }
        }
        if(N >=0) {
            if(N%K > 0) {
                sb.append(K);
            }else {
                sb.append(K-1);
            }
        }
        System.out.print(sb);
    }
}
