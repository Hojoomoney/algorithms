package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Freshman {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            Map<Integer, Integer> ranks = new HashMap<>();
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                ranks.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }
            for (Map.Entry<Integer, Integer> entry : ranks.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                for (Map.Entry<Integer, Integer> check : ranks.entrySet()) {
                    if(key > check.getKey() && value > check.getValue()){
                        N--;
                        break;
                    }
                }
            }
            System.out.println(N);
        }
    }

}
