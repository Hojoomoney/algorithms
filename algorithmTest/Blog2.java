package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Blog2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String color = br.readLine();
        List<String> bList = new ArrayList<>();
        List<String> rList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(color,"R");
        while(st.hasMoreTokens()){
            bList.add(st.nextToken());
        }
        st = new StringTokenizer(color,"B");
        while(st.hasMoreTokens()){
            rList.add(st.nextToken());
        }

        if (bList.size() > rList.size()){
            System.out.println(1+rList.size());
        } else {
            System.out.println(1+bList.size());
        }

    }
}
