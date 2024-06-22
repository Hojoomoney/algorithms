package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dna {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] dna = new String[N];
        for (int i = 0; i < N; i++) {
            dna[i] = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < M; i++) {
            int[] alpha = new int[4];
            for (int j = 0; j < N; j++) {
                switch (dna[j].charAt(i)){
                    case 'A':
                        alpha[0]++;
                        break;
                    case 'C':
                        alpha[1]++;
                        break;
                    case 'G':
                        alpha[2]++;
                        break;
                    case 'T':
                        alpha[3]++;
                        break;
                }
            }
            int max = 0;
            int maxIndex = 0;
            for (int j = 0; j < 4; j++) {
                if (alpha[j] > max){
                    max = alpha[j];
                    maxIndex = j;
                }
            }
            count += N - max;
            switch (maxIndex){
                case 0:
                    sb.append('A');
                    break;
                case 1:
                    sb.append('C');
                    break;
                case 2:
                    sb.append('G');
                    break;
                case 3:
                    sb.append('T');
                    break;
            }
        }
        System.out.println(sb);
        System.out.println(count);
    }
}
