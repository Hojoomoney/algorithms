import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        /**
         * 최적화 문제 중 최대값 구하기
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오.");
        System.out.println("시험에 응시한 학생수는 몇명입니까 ?");
        String[] students = new String[sc.nextInt()];
        System.out.println("응시한 학생의 이름을 입력하세요");
        for (int i = 0; i < students.length; i++) {
            students[i] = sc.next();
        }
        int[] scores = new int[students.length];
        String winner = "";
        int max = 0;
        System.out.println("점수를 입력하시오.");
        for(int i = 0;i < scores.length;i++){
            scores[i] = sc.nextInt();
            if (scores[i] > max) {
                max = scores[i];
                winner = students[i];
            }
        }
        System.out.println(students.length +"명중 1등 학생은 " +winner + "이고 점수는 "+ max + "이다");
//        if (arr[0] > arr[1]) {
//            System.out.println("입력된 값중 최대값은 "+ arr[0] + "이다");
//        } else {
//            System.out.println("입력된 값중 최대값은 "+ arr[1] + "이다");
//        }
//        for (int i = 0; i < 2; i++) {
//            System.out.println("자연수를 입력하세요.");
//        }
    }
}
