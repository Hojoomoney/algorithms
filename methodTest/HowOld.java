package methodTest;

import java.util.Scanner;

public class HowOld {

    static int inputAge(Scanner sc){
        System.out.print("나이는? ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = inputAge(sc);
        System.out.println("당신의 나이 : " + age);
    }
}
