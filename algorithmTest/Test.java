import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n1 = st.nextToken();
        String n2 = st.nextToken();

        int min = Integer.parseInt(n1.replace('6','5')) +
                Integer.parseInt(n2.replace('6','5'));

        int max = Integer.parseInt(n1.replace('5','6')) +
                Integer.parseInt(n2.replace('5','6'));

        System.out.println(min + " " + max);

    }
}
