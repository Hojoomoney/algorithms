import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            numbers.add(n);
        }
        for (Integer number : numbers) {
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for (int i = 1; i <= number/2; i++) {
                if (number % i == 0) {
                    sb.append(i).append(" + ");
                    sum += i;
                }
            }
            sb.delete(sb.length() - 2, sb.length());
            if (sum == number) {
                System.out.println(number + " = " + sb);
            } else {
                System.out.println(number + " is NOT perfect.");
            }
        }

    }
}
