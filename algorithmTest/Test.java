package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, String> mine = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mine.put(st.nextToken(),"0");
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if(mine.get(st.nextToken()) != null) sb.append("1 ");
            else sb.append("0 ");
        }
        System.out.println(sb);
    }
}
=======
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       List<Integer> list = new ArrayList<>(1000);
        int count = 1;
        while (list.size() < 1000){
            for (int i = 0; i < count; i++) {
                    list.add(count);
            }
            count++;
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i = num1-1; i < num2; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
>>>>>>> 984d66e695b718ed1c82aaf2e06ad4c9b1eacc8d
