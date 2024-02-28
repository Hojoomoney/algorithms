package algorithmTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> passwords = new ArrayList<>();
        String password = "";
        while(!password.equals("end")){
            password = scan.next();
            passwords.add(password);
        }

        for (String word : passwords){
            if(word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")){

            }
        }


        System.out.println(passwords);
    }
}
