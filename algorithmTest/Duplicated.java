package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Duplicated {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        int count = 0;
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if(map.get(key) > 1){
                count++;
                list.add(key);
            }
        }
        Collections.sort(list);
        System.out.println(count);
        for (String key : list) {
            if(map.get(key) > 1){
                System.out.println(key);
            }
        }
    }
}
