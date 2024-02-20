package memberOOP;

import java.util.Scanner;

public class MemberView {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        Member member = new Member();

        System.out.print("ID: ");
        member.setUsername(sc.next());

        System.out.print("비 번: ");
        member.setPassword(sc.next());

        System.out.print("비번확인: ");
        member.setConfirmPassword(sc.next());

        System.out.print("이름: ");
        member.setName(sc.next());

        System.out.print("주민번호: ");
        member.setRegNumber(sc.next());

        System.out.print("전화번호: ");
        member.setPhoneNumber(sc.next());

        System.out.print("주소: ");
        member.setAddress(sc.next());

        System.out.print("직업: ");
        member.setJob(sc.next());

        System.out.println("ID : " + member.getUsername());
        System.out.println("비 번 : " + member.getPassword());
        System.out.println("비번확인 : " + member.getConfirmPassword());
        System.out.println("이름 : " + member.getName());
        System.out.println("주민번호 : " + member.getRegNumber());
        System.out.println("전화번호 : " + member.getPhoneNumber());
        System.out.println("주소 : " + member.getAddress());
        System.out.println("직업 : " + member.getJob());
    }
}
