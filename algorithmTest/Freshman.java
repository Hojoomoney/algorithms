package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Freshman {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String[] input;
        for(int i=0;i<n;i++){
            int m= Integer.parseInt(br.readLine());
            int count=1;
            int[] work = new int[m+1];
            for(int j=0;j<m;j++){
                input = br.readLine().split(" ");
                int a= Integer.parseInt(input[0]);
                int b= Integer.parseInt(input[1]);
                work[a]=b;
            }

            int vot = work[1];

            for(int j = 2;j <= m; j++){
                if(work[j] < vot){
                    vot = work[j];
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
