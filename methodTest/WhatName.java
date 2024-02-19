package methodTest;

public class WhatName {

    static String returnName(String lastName){
        return "제임스 " + lastName;
    }
    public static void main(String[] args) {
        String lastName = "고슬링";
        String name = returnName(lastName);
        System.out.println("이름 : " + name);
    }
}
