package kaupOOP;

import java.util.Scanner;

public class KaupView {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Name : ");
        person.setName(scan.next());

        person.setHeight(person.createRandomHeight());

        person.setWeight(person.createRandomWeight());

        person.createBmi();
        person.createBodyMass();

        System.out.println("=========== BMI 계산기 ===========");
        System.out.printf("Name : %s\n" , person.getName());
        System.out.printf("Height : %.1f\n" , person.getHeight());
        System.out.printf("Weight : %.1f\n" , person.getWeight());
        System.out.printf("BMI : %.1f\n", person.getBmi());
        System.out.printf("체지방 : %s\n", person.getBodyMass());
        System.out.println("=========== BMI 계산기 ===========");
    }
}

