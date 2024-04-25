import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperMario {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mushrooms = new int[10];
        for (int i = 0; i < 10; i++) {
            mushrooms[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        int first = 0;
        for (int i = 0; i < 10; i++) {
            sum+= mushrooms[i];
            if(sum >= 100){
                first = sum - mushrooms[i];
                break;
            }
        }

        if(100 - first < sum - 100) System.out.println(first);
        else System.out.println(sum);


    }
}
