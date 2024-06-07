package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Tteokguk {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> bowls = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            bowls.add(Integer.parseInt(st.nextToken()));
        }
        bowls.sort(Collections.reverseOrder());
        int count = 1;
        while(!bowls.isEmpty()) {
            for (int i = 0; i < bowls.size() - 1; i++) {
                if (bowls.get(i) != bowls.get(i + 1)) {
                    bowls.remove(i);
                    i--;
                }
            }
            bowls.remove(bowls.size() - 1);
            if(!bowls.isEmpty()){
                count++;
            }
        }
        System.out.println(count);
    }
}
