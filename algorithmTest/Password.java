package algorithmTest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Password {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> passwords = new ArrayList<>();
        String password = "";
        while(!password.equals("end")){
            password = br.readLine();
            if(!password.equals("end")){
                passwords.add(password);
            }
        }
        for (String word : passwords) {
            if(validation(word)){
                System.out.println("<" + word + "> is acceptable.");
            } else {
                System.out.println("<" + word + "> is not acceptable.");
            }
        }
    }
    static boolean validation(String word){
        if(!word.contains("a") &&
                !word.contains("e") &&
                !word.contains("i") &&
                !word.contains("o") &&
                !word.contains("u")){
            return false;
        }
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                if (arr[i] != 'e' && arr[i] != 'o') {
                    return false;
                }
            }
        }
        for (int i = 0; i < arr.length-2; i++) {
            if (checkVowels(arr[i]) && checkVowels(arr[i+1]) && checkVowels(arr[i+2])) {
                return false;
            }
            if (!checkVowels(arr[i]) && !checkVowels(arr[i+1]) && !checkVowels(arr[i+2])) {
                return false;
            }
        }
        return true;
    }
    static boolean checkVowels(char alphabet){
        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
            return true;
        } else {
            return false;
        }
    }
}
