package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Big {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        WH[] people = new WH[N];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            people[i] = new WH(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        }
        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (people[i].height < people[j].height && people[i].weight < people[j].weight) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
class WH{
    int weight;
    int height;
    WH(int weight, int height){
        this.weight = weight;
        this.height = height;
    }
}
