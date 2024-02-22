package matrixTest;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        boolean check = false;
        while(!check) {
            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = (int) (Math.random()*45) + 1;
            }
            boolean hasDuplicate = false;
            for (int i = 0; i < lotto.length; i++) {
                for (int j = i+1; j < lotto.length ; j++) {
                    if(lotto[i] == lotto[j]){
                        hasDuplicate = true;
                    }
                }
            }
            if(!hasDuplicate){
                check = true;
            }
        }

        for (int i = 1; i < lotto.length; i++) {
            for (int j = 0; j < lotto.length-i; j++) {
                if(lotto[j] > lotto[j+1]){
                    int temp = lotto[j+1];
                    lotto[j+1] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }

    }
}
