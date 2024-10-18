package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchingDocument {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String find = br.readLine();
        int result = 0;
        while(word.contains(find)){
            word = word.replaceFirst(find, " ");
            result++;
        }
        System.out.print(result);
    }
}
