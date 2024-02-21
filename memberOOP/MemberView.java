package memberOOP;

import java.util.Scanner;

public class MemberView {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        System.out.println("ID, 비번, 비번확인, 이름, 주민번호, 전화번호, 주소, 직업을 순서대로 입력하세요.");
        Member member = new Member(sc.next(), sc.next(),
                                    sc.next(), sc.next(),
                                    sc.next(), sc.next(),
                                    sc.next(), sc.next() );

        System.out.println(member);
    }
}
