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
        int middleMax = getMaxMiddle(honey, totalHoney, max);
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
    static int getMaxMiddle(int[] honey, int totalHoney, int max){
        int leftBee = 0;
        int rightBee = totalHoney - honey[honey.length-1];
        for (int i = 1; i < honey.length-1; i++) {
            leftBee += honey[i];
            rightBee -= honey[i-1];
            int sum = leftBee + rightBee;
            max = Math.max(sum,max);
        }
        return max;
    }
}
