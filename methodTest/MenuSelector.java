package methodTest;

import java.util.Scanner;

public class MenuSelector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("[메뉴] 0.종료 1.생성 2.수정 ");
            String menu = scan.next();
            switch (menu){
                case "0" :
                    System.out.println("종료");
                    return;
                case "1" :
                    System.out.println("생성");
                    break;
                case "2" :
                    System.out.println("수정");
                    break;
            }
        }
    }
}
