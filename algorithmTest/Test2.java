package algorithmTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sixteen = br.readLine();
        int ten = Integer.parseInt(sixteen,16);
        System.out.println(ten);
    }
}
