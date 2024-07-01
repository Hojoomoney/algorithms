package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MatrixMultiple {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] A = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
        for (int i = 0; i < A.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int[][] B = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
        for (int i = 0; i < B.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
