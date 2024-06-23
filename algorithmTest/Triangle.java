package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        for (int i = 0; i < N-2; i++) {
            if(arr[i] < arr[i+1] + arr[i+2]){
                System.out.println(arr[i] + arr[i+1] + arr[i+2]);
                return;
            }
        }
        System.out.println(-1);


    }
}
