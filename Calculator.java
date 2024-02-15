import java.util.Scanner;

public class Calculator { //클래스
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //타입 네임 = 키워드 메소드
        System.out.print("첫번째 숫자를 입력하세요 : ");
        String firstNumber = scan.next();

        System.out.print("두번째 숫자를 입력하세요 : ");
        String secondNumber = scan.next();
        System.out.println("연산기호를 입력하세요");
        String opcode = scan.next();
        int result = 0;
        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
        if (opcode.equals("+")) {
            result = num1 + num2;
        } else if (opcode.equals("-")) {
            result = num1 - num2;
        } else if (opcode.equals("*")) {
            result = num1 * num2;
        } else if (opcode.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.println("잘못된 연산기호 입니다");
        }
        System.out.println("연산결과 : " + result);
    }
}
