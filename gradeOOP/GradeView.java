package gradeOOP;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade grade = new Grade();
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.print("이름 : ");
        grade.setName(sc.next());

        grade.createRandomKoreanScore();
        grade.createRandomEnglishScore();
        grade.createRandomMathScore();
        grade.createAverage();

        System.out.println("평균 점수를 구하시오");

        System.out.println(" ============= 성적표 ==============");
        System.out.println("이름 : " + grade.getName());
        System.out.println("국어점수 : " + grade.getKoreanScore());
        System.out.println("영어점수 : "+ grade.getEnglishScore());
        System.out.println("수학점수 : "+ grade.getMathScore());
        System.out.println("평균 점수: "+ grade.getAverage());

    }
}