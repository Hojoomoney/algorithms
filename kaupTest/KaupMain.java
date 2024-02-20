package kaupTest;

import kaupOOP.Person;

public class KaupMain {
    //키 150-200
    //몸무게 30-130
    public static void main(String[] args) {

        Person person = new Person();

        double heightCM = (Math.random() * 50)+150;
        person.setHeight(heightCM);
        double heightM = heightCM / 100;
        double weight = (Math.random() * 69)+30;
        System.out.printf("Height : %.1f\n" ,person.getHeight());
        System.out.printf("Weight : %.1f\n" ,weight);
        double bmi = weight / (heightM * heightM);
        System.out.printf("BMI : %.1f",bmi);
    }
}
