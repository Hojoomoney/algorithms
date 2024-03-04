package algorithmTest;

import java.util.*;

public class MeetingRoom {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Times> times = new ArrayList<>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            times.add(new Times(scan.nextInt(),scan.nextInt()));
        }
        Collections.sort(times);
        int count = 0;
        int endTime = 0;

        for (Times time : times){
            if (endTime <= time.startTime){
                endTime = time.endTime;
                count++;
            }
        }
        System.out.println(count);
    }
}
class Times implements Comparable<Times>{
    int startTime;
    int endTime;

    public Times(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    @Override
    public int compareTo(Times times) {

        if(times.endTime == endTime){
            return startTime - times.startTime;
        }
        return endTime - times.endTime;
    }
}
