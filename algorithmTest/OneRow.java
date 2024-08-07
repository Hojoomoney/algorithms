package algorithmTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class OneRow {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        List<Integer> result = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=N; i>=1; i--){
            result.add(arr[i], i);
        }

        StringBuilder sb = new StringBuilder();
        for(int su : result){
            sb.append(su).append(" ");
        }
        System.out.println(sb);

    }

}