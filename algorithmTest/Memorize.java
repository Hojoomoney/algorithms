package algorithmTest;


import java.io.*;
import java.util.*;

public class Memorize {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        while (N-- > 0) {
            String name = br.readLine();
            if (name.length() >= M) {
                map.put(name, map.getOrDefault(name, 0) + 1);
            }
        }
        List<String> words = new ArrayList<>(map.keySet());

        Comparator<String> comp = (o1, o2) -> {
            if (!map.get(o1).equals(map.get(o2))) {
                return map.get(o2) - map.get(o1);
            }
            if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            }
            return o1.compareTo(o2);
        };
        words.sort(comp);
        for (String word : words) {
            bw.write(word + "\n");
        }
        bw.flush();
    }
}
