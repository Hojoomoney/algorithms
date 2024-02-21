package kaupOOP;

import memberOOP.Member;

import java.util.Scanner;

public class KaupView {
    static String test;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Member person = new Member((Math.random()*50)+150,
                                     (Math.random()*69)+30);
        KaupService service = new KaupServiceImpl();
        double bmi = service.createBmi();
        String bodyMass = service.createBodyMass();

        System.out.println("=========== BMI 계산기 ===========");
        System.out.printf("Name : %s\n" , person.getName());
        System.out.printf("Height : %.1f\n" , person.getHeight());
        System.out.printf("Weight : %.1f\n" , person.getWeight());
        System.out.printf("BMI : %.1f\n", bmi);
        System.out.printf("체지방 : %s\n", bodyMass);
        System.out.println("=========== BMI 계산기 ===========");
    }
}

