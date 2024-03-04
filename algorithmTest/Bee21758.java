package algorithmTest;

import java.util.Scanner;

public class Bee21758 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long[] honey = new long[scan.nextInt()];
        long totalHoney = 0;
        for (int i = 0; i < honey.length; i++) {
            honey[i] = scan.nextInt();
            totalHoney += honey[i];
        }
        long max = 0;

        long rightCornerBee = totalHoney - honey[0];
        long movingBee = rightCornerBee;
        for (int i = 1; i < honey.length-1; i++) {
            long fixingBee = rightCornerBee - honey[i];
            movingBee -= honey[i];
            long sum = fixingBee + movingBee;
            max = Math.max(sum,max);
        }
        long leftCornerBee = totalHoney - honey[honey.length-1];
        movingBee = leftCornerBee;
        for (int i = honey.length-2; i > 1; i--) {
            long fixingBee = leftCornerBee - honey[i];
            movingBee -= honey[i];
            long sum = fixingBee + movingBee;
            max = Math.max(sum,max);
        }
        for (int i = 1; i < honey.length-1; i++) {

            long sum = 0;
            for (int j = 1; j <= i ; j++) {
                sum += honey[j];
            }
            for (int j = honey.length - 2; j >= i ; j--) {
                sum += honey[j];
            }
            max = Math.max(sum,max);
        }
        System.out.println(max);
    }
    
}
