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
        int max = 0;
        int rightCornerMax = getMaxRightCorner(honey, totalHoney, max);
        int leftCornerMax = getMaxLeftCorner(honey,totalHoney, max);
        int middleMax = getMaxMiddle(honey, max);
        max = Math.max(rightCornerMax,Math.max(leftCornerMax,middleMax));
        System.out.println(max);
    }
    static int getMaxRightCorner(int[] honey, int totalHoney, int max){
        int rightCornerBee = totalHoney - honey[0];
        int movingBee = rightCornerBee;
        for (int i = 1; i < honey.length-1; i++) {
            int fixingBee = rightCornerBee - honey[i];
            movingBee -= honey[i];
            int sum = fixingBee + movingBee;
            max = Math.max(sum,max);
        }
        return max;
    }
    static int getMaxLeftCorner(int[] honey, int totalHoney, int max){
        int leftCornerBee = totalHoney - honey[honey.length-1];
        int movingBee = leftCornerBee;
        for (int i = honey.length-2; i > 0; i--) {
            int fixingBee = leftCornerBee - honey[i];
            movingBee -= honey[i];
            int sum = fixingBee + movingBee;
            max = Math.max(sum,max);
        }
        return max;
    }
    static int getMaxMiddle(int[] honey, int max,int totalHoney){
//        int leftBee = 0;
//        int rightBee = totalHoney - honey[0] - honey[honey.length-1];
        for (int i = 1; i < honey.length-1; i++) {
            //leftBee += honey[i];

            int sum = 0;
            for (int j = 1; j <= i ; j++) {
                sum += honey[j];
            }
            for (int k = honey.length - 2; k >= i ; k--) {
                sum += honey[k];
            }
            max = Math.max(sum,max);
            System.out.println(max);
        }
        return max;
    }
}
