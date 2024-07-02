package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Statistics {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Integer[] arr = new Integer[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        sb.append((int)Math.round((double)sum/N)).append("\n");
        Arrays.sort(arr);
        sb.append(arr[N/2]).append("\n");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Integer max = 0;
        List<Integer> maxList = new ArrayList<>();
        for (Integer i : map.keySet()) {
            if (map.get(i) > max) {
                max = map.get(i);
                maxList.clear();
                maxList.add(i);
            } else if (Objects.equals(map.get(i), max)) {
                maxList.add(i);
            }
        }
        Collections.sort(maxList);
        sb.append(maxList.size() > 1 ? maxList.get(1) : maxList.get(0)).append("\n");
        sb.append(arr[N-1] - arr[0]);
        System.out.print(sb);
    }
}
