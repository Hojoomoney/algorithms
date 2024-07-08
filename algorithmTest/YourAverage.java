package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YourAverage {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double result=0;
        double sum=0;

        for (int i = 0; i <20; i++) {
            String[] s = br.readLine().split(" ");
            double d = Double.parseDouble(s[1]);
            double d2 = 0;
            String grade = s[2];
            if(grade.equals("P")) {
                continue;
            }else {
                switch (grade) {
                    case "A+":  d2 = 4.5;
                        break;
                    case "A0":  d2 = 4.0;
                        break;
                    case "B+":  d2 = 3.5;
                        break;
                    case "B0":  d2 = 3.0;
                        break;
                    case "C+":  d2 = 2.5;
                        break;
                    case "C0":  d2 = 2.0;
                        break;
                    case "D+":  d2 = 1.5;
                        break;
                    case "D0":  d2 = 1.0;
                        break;
                    case "F":  d2 = 0.0;
                }
                sum += d;
                result = result+(d*d2);

            }
        }
        System.out.printf("%.6f", result/sum);
    }
}
