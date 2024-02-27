package algorithmTest;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dwarfs = new int[9];
        int sum = 0;
        for (int i = 0; i < dwarfs.length; i++) {
            dwarfs[i] = sc.nextInt();
            sum += dwarfs[i];
        }
        int firstDwarf = 0;
        int secondDwarf = 0;
        int diff = sum - 100;
        for (int i = 0; i < dwarfs.length; i++) {
            for (int j = i+1; j < dwarfs.length; j++) {
                int total = dwarfs[i] + dwarfs[j];
                if(total == diff){
                    firstDwarf = i;
                    secondDwarf = j;
                }
            }
        }
        int[] newDwarfs = new int[9];
        for (int i = 0; i < dwarfs.length; i++) {
           if (i == firstDwarf || i == secondDwarf){
               newDwarfs[i] = 0;
           } else {
               newDwarfs[i] = dwarfs[i];
           }
        }
        Arrays.sort(newDwarfs);
        for (int i = 2; i < newDwarfs.length; i++) {
            System.out.println(newDwarfs[i]);
        }
    }
}