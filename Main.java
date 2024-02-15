import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        String id = sc.next();
        System.out.print("비 번: ");
        String password = sc.next();
        System.out.print("비번확인: ");
        String confirmPassword = sc.next();
        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("주민번호: ");
        String numberID = sc.next();
        System.out.print("전화번호: ");
        String phoneNumber = sc.next();
        System.out.print("주소: ");
        String address = sc.next();
        System.out.print("직업: ");
        String job = sc.next();

        System.out.println("ID : " + id);
        System.out.println("비 번 : " + password);
        System.out.println("비번확인 : " + confirmPassword);
        System.out.println("이름 : " + name);
        System.out.println("주민번호 : " + numberID);
        System.out.println("전화번호 : " + phoneNumber);
        System.out.println("주소 : " + address);
        System.out.println("직업 : " + job);
    }
}