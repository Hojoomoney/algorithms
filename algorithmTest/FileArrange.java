package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FileArrange {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String name = br.readLine().split("\\.")[1];
            map.put(name, map.getOrDefault(name, 0) + 1);
            set.add(name);
        }
        set.stream().sorted().forEach(key -> System.out.println(key + " " + map.get(key)));

    }
}
