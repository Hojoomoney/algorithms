package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ucpc {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine().replaceAll("[^A-Z]","");

        int place = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (place == 1 && sentence.charAt(i) == 'U') place++;
            if ((place == 2 || place == 4) && sentence.charAt(i) == 'C') place++;
            if (place == 3 && sentence.charAt(i) == 'P') place++;
        }
        if(place == 5) System.out.println("I love UCPC");
        else System.out.println("I hate UCPC");

    }
}
