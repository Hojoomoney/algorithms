package algorithmTest;

import java.util.*;

public class MeetingRoom {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Times> times = new ArrayList<>();
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
    public int startTime;
    public int endTime;

    public Times(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "algorithmTest.Times{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    @Override
    public int compareTo(Times times) {
        if(times.endTime < endTime){
            return 1;
        } else if (times.endTime > endTime){
            return -1;
        } else if (times.endTime == endTime){
            if(times.startTime < startTime){
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }
}
