package algorithmTest;

import java.util.*;

public class Exchange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        List<Character> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
            if(str.charAt(i) == 'a'){
                count++;
            }
        }
        for (int i = 0; i < count-1; i++) {
            list.add(str.charAt(i));
        }
        int min = Integer.MAX_VALUE;
        int bCount = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < count+i; j++) {
                if(list.get(j) == 'b'){
                    bCount++;
                }
            }
            min = Math.min(bCount,min);
            bCount = 0;
        }
        System.out.println(min);

    }
}
