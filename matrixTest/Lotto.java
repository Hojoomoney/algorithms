package matrixTest;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. 서로 겹치지 않는 숫자 6개를 생성
 * 2. 각 숫자는 1 ~ 45 범위 내의 숫자
 * 3. 매번 실행 시 다른 숫자 출력
 * 4. 오름차순 정렬
 * -> 랜덤수 : Math 사용
 * 결과)
 * ----------------
 * 로또 번호
 * ----------------
 * 2 11 25 27 35 38
 */
public class Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IBuyLotto buy = new BuyLotto();
        ILottoDraw draw = new LottoDraw();
        ILottoMatch match = new LottoMatch();

        // 로또 구입
        int[] buyLotto = buy.buyLotto(sc);

        int[] arr = new int[6];
        arr = draw.createArrayWithoutDuplicates(arr);
        arr = draw.sortAscending(arr);

        draw.printLotto(buyLotto);
        draw.printLotto(arr);

        //int count = match.findSame(arr, buyLotto);
        //String message = match.rank(count);
        System.out.println(match.rank(match.findSame(arr, buyLotto)));
        // 구입한 로또와 추첨한 로또의 일치여부 체크

    }


}

interface IBuyLotto {
    int[] buyLotto(Scanner sc);
}

interface ILottoDraw {
    int createRandomNumber(int start, int end);

    int[] createArrayWithoutDuplicates(int[] arr);

    int[] sortAscending(int[] arr);

    void printLotto(int[] arr);
}

interface ILottoMatch {
    int findSame(int[] originLotto, int[] myLotto);

    String rank(int count);
}

class BuyLotto implements IBuyLotto {

    @Override
    public int[] buyLotto(Scanner sc) {
        System.out.println("로또 번호를 입력해주시오.");
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++) {
            lotto[i] = sc.nextInt();
        }
        return lotto;
    }
}

class LottoDraw implements ILottoDraw {

    @Override
    public void printLotto(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d \t", arr[i]);
        }
        System.out.println();
    }

    @Override
    public int[] sortAscending(int[] arr) {
        // 버블 정렬이 들어갈 부분
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    @Override
    public int[] createArrayWithoutDuplicates(int[] arr) {
        for (int i = 0; i < 6; i++) {
            int randomNumber = createRandomNumber(1, 8);
            boolean check = false;
            for (int j = 0; j < 6; j++) {
                if (arr[j] == randomNumber) {
                    // 중복되면  check 를 true 로 바꿔라..
                    check = true;
                }
            }
            if (check == false) {
                arr[i] = randomNumber; // 중복되지 않았으니 배열에 담아라.
            } else {
                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
            }

        }
        return arr;
    }

    @Override
    public int createRandomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(end) + start;
    }

}

class LottoMatch implements ILottoMatch {
    @Override
    public int findSame(int[] originLotto, int[] myLotto) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (originLotto[i] == myLotto[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public String rank(int count) {
        String message = "";
        switch (count) {
            case 3:
                message = "축하합니다. 4등입니다.";
                break;
            case 4:
                message = "축하합니다. 3등입니다.";
                break;
            case 5:
                message = "축하합니다. 2등입니다.";
                break;
            case 6:
                message = "축하합니다. 1등입니다.";
                break;
            default:
                message = "아쉽습니다. 꽝입니다.";
        }
        return message;
    }
}

