//package matrixTest;
//
//import java.sql.SQLOutput;
//import java.util.Random;
//import java.util.Scanner;
//
///**
// * 로또 발급은 1 - 8 까지 중복없는 숫자 6개이다. 하나는 구매한 로또이다.
// * 추가된 로직은 추첨된 로또이다.
// * 두 로또의 일치여부에 따라
// * 다음과 같은 메시지를 출력한다.
// * 단 구매로또 번호와 추첨로또 번호 모두 같이 출력한다.
// *
// * 1등 - 6개 맞음
// * 2등 - 5개 맞음
// * 3등 - 4개 맞음
// * 4등 - 3개 맞음
// * 꽝 - 2개 이하
// */
//public class LottoMatching {
//    public static void main(String[] args) {
//        // 1 ~ 45 범위 내의 서로 겹치지 않는 숫자 6개를 생성
//        // 중복되지 않은 상태
//        Scanner sc = new Scanner(System.in);
//        int[] lottoWinning = new int[6];
//        System.out.println("로또 번호를 입력하세요 : ");
//        int[] lottoBought = BuyLotto.buyLotto(sc);
//        lottoWinning = createLotto(lottoWinning);
//
//
//        // 출력
//        printLotto(lottoBought);
//        printLotto(lottoWinning);
//        System.out.println(matchLotto(lottoBought, lottoWinning));
//    }
//
//    public static void printLotto(int[] arr) {
//        for(int i =0; i< arr.length; i++){
//            System.out.printf("%d \t", arr[i]);
//        }
//        System.out.println();
//    }
//
//    public static void sortAscending(int[] arr) {
//        // 버블 정렬이 들어갈 부분
//        for(int i=0; i< arr.length;i++){
//            for(int j=0; j < arr.length -1; j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
//    }
//
//    public static int[] createArrayWithoutDuplicates(int[] arr) {
//        for(int i=0; i<6; i++){
//            int randomNumber = createRandomNumber(1,8);
//            boolean check = false;
//            for(int j=0; j<6; j++){
//                if(arr[j] == randomNumber){
//                    // 중복되면  check 를 true 로 바꿔라..
//                    check = true;
//                }
//            }
//            if(check==false){
//                arr[i] = randomNumber; // 중복되지 않았으니 배열에 담아라.
//            }else{
//                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
//            }
//
//        }
//        return arr;
//    }
//
//    public static int createRandomNumber(int start, int end) {
//        Random random = new Random();
//        return random.nextInt(end)+start;
//    }
//    public static int[] createLotto(int[] lotto){
//        int[] arr = createArrayWithoutDuplicates(lotto);
//        sortAscending(arr);
//        return arr;
//    }
//    public static String matchLotto(int[] lottoBought, int[] lottoWinning){
//        int count = 0;
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                if(lottoBought[i] == lottoWinning[j]) {
//                    count++;
//                }
//            }
//        }
//        String message = getRank(count);
//        return message;
//    }
//    public static String getRank(int count){
//        String message = "";
//        switch (count){
//            case 3:
//                message = "축하합니다. 4등입니다.";
//                break;
//            case 4:
//                message = "축하합니다. 3등입니다.";
//                break;
//            case 5:
//                message = "축하합니다. 2등입니다.";
//                break;
//            case 6:
//                message = "축하합니다. 1등입니다.";
//                break;
//            default :
//                message = "아쉽습니다. 꽝입니다.";
//        }
//        return message;
//    }
//}
//class BuyLotto{
//    public static int[] buyLotto(Scanner sc){
//        int[] lotto = new int[6];
//        for (int i = 0; i < 6; i++) {
//            lotto[i] = sc.nextInt();
//        }
//        return lotto;
//    }
//}
