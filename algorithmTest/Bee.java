package algorithmTest;

import java.util.Scanner;

public class Bee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] honey = new int[n];
        int totalHoney = 0;
        for (int i = 0; i < honey.length; i++) {
            honey[i] = scan.nextInt();
            totalHoney += honey[i];
        }
        int rightCornerMax = getMaxRightCorner(honey, totalHoney);
        int leftCornerMax = getMaxLeftCorner(honey,totalHoney);
        int middleMax = getMaxMiddle(honey);
        int max = Math.max(rightCornerMax,Math.max(leftCornerMax,middleMax));
        System.out.println(max);
    }
    static int getMaxRightCorner(int[] honey, int totalHoney){
        int rightCornerBee = totalHoney - honey[0];
        int movingBee = rightCornerBee;
        int max = 0;
        for (int i = 1; i < honey.length-1; i++) {
            int fixingBee = rightCornerBee - honey[i];
            movingBee -= honey[i];
            int sum = fixingBee + movingBee;
            max = Math.max(sum,max);
        }
        return max;
    }
    static int getMaxLeftCorner(int[] honey, int totalHoney){
        int leftCornerBee = totalHoney - honey[honey.length-1];
        int movingBee = leftCornerBee;
        int max = 0;
        for (int i = honey.length-2; i > 1; i--) {
            int fixingBee = leftCornerBee - honey[i];
            movingBee -= honey[i];
            int sum = fixingBee + movingBee;
            max = Math.max(sum,max);
        }
        return max;
    }
    static int getMaxMiddle(int[] honey){
        int max = 0;
        for (int i = 1; i < honey.length-1; i++) {

            int sum = 0;
            for (int j = 1; j <= i ; j++) {
                sum += honey[j];
            }
            for (int j = honey.length - 2; j >= i ; j--) {
                sum += honey[j];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
