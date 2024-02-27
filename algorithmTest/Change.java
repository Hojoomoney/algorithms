package algorithmTest;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int moneyLeft = 1000 - scan.nextInt();
        int[] money = {500,100,50,10,5,1};
        int count = 0;
            for (int i = 0; i < money.length; i++) {
                count += moneyLeft / money[i];
                moneyLeft %= money[i];
            }
        System.out.println(count);
    }
}
