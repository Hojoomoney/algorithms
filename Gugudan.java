import java.util.Scanner;
public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " * " + i  + " = " + dan * i);
        }
    }
}
