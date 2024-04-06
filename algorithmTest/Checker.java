package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Checker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            counts.put(word.charAt(i),0);
        }
        for (int i = 0; i < word.length(); i++) {
            counts.put(word.charAt(i),counts.get(word.charAt(i)) + 1);
        }
        int max = 0;
        Character result = ' ';
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
             if( entry.getValue() > max){
                 max = entry.getValue();
                 result = entry.getKey();
             }

        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (max == entry.getValue()){
                count++;
            }
        }
        if(count > 1){
            System.out.println("?");
        } else {
            System.out.println(result);
        }
    }
}
