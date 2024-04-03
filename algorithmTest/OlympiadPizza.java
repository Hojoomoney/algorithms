package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class OlympiadPizza {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            people.add(Integer.parseInt(st.nextToken()));
        }
        int[] times = new int[n];
        int seconds = 1;
        int last = n;
        while (last != 0) {
            for (int i = 0; i < n; i++) {
                if (people.get(i) == 0){
                    continue;
                }
                if (people.get(i) == 1){
                    times[i] = seconds;
                    people.set(i, 0) ;
                    last--;
                } else {
                    people.set(i, people.get(i)-1) ;
                }
                seconds++;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(times[i] + " ");
        }
    }
}
