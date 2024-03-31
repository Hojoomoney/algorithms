package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(br.readLine());
        
        List<Integer> maxCounts = new ArrayList<>();
        int loop = 1;
        while (loop <= numCases){
            int apps = Integer.parseInt(br.readLine());
            for (int i = 0; i < apps; i++) {
                List<Rank> ranks = new ArrayList<>();
            }



            loop++;
        }
    }
}
class Rank {
    int document;
    int interview;

    public Rank(int document, int interview) {
        this.document = document;
        this.interview = interview;
    }

    public int getDocument() {
        return document;
    }

    public int getInterview() {
        return interview;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public void setInterview(int interview) {
        this.interview = interview;
    }
}
