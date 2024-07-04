package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Prefix {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (!list.contains(s)){
                list.add(s);
            }
        }
        int count = list.size();
        for (String check : list) {
            for (String checked : list) {
                if(checked.startsWith(check) && !checked.equals(check)){
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
