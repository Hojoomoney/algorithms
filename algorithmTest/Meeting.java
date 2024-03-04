package algorithmTest;

import java.util.Arrays;
import java.util.Scanner;

public class Meeting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] times = new int[n][2];
        for (int i = 0; i < n; i++) {
            times[i][0] = scan.nextInt();
            times[i][1] = scan.nextInt();
        }

    }
}
