package methodTest;

import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = WhatName2.inputName(sc);
        int age = HowOld.inputAge(sc);
        System.out.printf("이름 : %s, 나이 : %d",name,age);
    }
}
