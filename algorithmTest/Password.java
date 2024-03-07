package algorithmTest;

import java.util.*;

public class Password {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        List<String> passwords = new ArrayList<>();
        String password = "";
        while(!password.equals("end")){
            password = scan.next();
            if(!password.equals("end")){
                passwords.add(password);
            }
        }


        
    }
    static boolean checkVowels(String word){
        if(word.contains("a") ||
                word.contains("e") ||
                word.contains("i") ||
                word.contains("o") ||
                word.contains("u")){
            return true;
        } else return false;
    }
    static boolean check2inRow(char first, char second){
        if(first == second){
            if(first == 'e' || first == 'o'){
                return true;
            } else return false;
        } else return true;
    }
    static boolean checkConOrVowInRow(String first, String second, String third){
        if(checkVowels(first) && checkVowels(second) && checkVowels(third)){
            return false;
        }
        if(!checkVowels(first) && !checkVowels(second) && !checkVowels(third)){
            return false;
        }
        return true;
    }
}
