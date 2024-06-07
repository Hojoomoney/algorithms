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
        int count = 1;
        HashSet<Integer> set = new HashSet<>(bowls);
        for (Integer i : set) {
            count = Math.max(Collections.frequency(bowls, i),count);
        }
        System.out.println(count);
    }
}
