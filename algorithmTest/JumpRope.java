package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Collections;

public class JumpRope {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> people = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            people.add(Integer.parseInt(st.nextToken()));
        }
        Set<Integer> set = new HashSet<>(people);
        int max = N;
        for (Integer i : set) {
            int count = Collections.frequency(people, i);
            if(count > 2){
                max -= (count - 2);
            }
        }
        System.out.println(max);

    }
}
