package algorithmTest;

import java.util.Arrays;
import java.util.Scanner;

public class Dwarf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if(sum-(arr[i] + arr[j]) == 100){
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }
        }
        Arrays.sort(arr);
        for (int k = 2; k < 9; k++) {
            System.out.println(arr[k]);
        }

    }
}
