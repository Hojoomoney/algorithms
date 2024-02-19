import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("반의 수를 입력하세요.");
        int numberOfClasses = sc.nextInt();
        int[] numbersOfClasses = inputNumberOfStudents(sc,numberOfClasses);
        for (int i = 0; i < numbersOfClasses.length; i++) {
            printAvgAndMax(numbersOfClasses[i], i);
        }
    }
    private static int[] inputNumberOfStudents(Scanner sc,int numberOfClasses){
        int[] numbersOfClasses = new int[numberOfClasses];
        for (int i = 0; i < numbersOfClasses.length; i++) {
            System.out.println(i+1 + "반에서 응시한 학생수는 몇명입니까 ?");
            numbersOfClasses[i] = sc.nextInt();
        }
        return numbersOfClasses;
    }
    private static void printAvgAndMax(int numberOfStudents,int index){
        System.out.print(index+1 + "반의 점수 : ");
        int max = 0;
        int sum = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            int randomNumber = (int) (Math.random()*100);
            if (randomNumber > max){
                max = randomNumber;
            }
            sum += randomNumber;
            System.out.print(randomNumber + " ");
        }
        int avg = sum / numberOfStudents;
        System.out.println();
        System.out.println(index+1 + "반의 평균 점수는 " + avg + "이고, 최고 점수는 " + max +" 이다");
    }
}
