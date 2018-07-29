import java.time.*;

public class Exer1_CompareLoopTimes3 {

    public static void main(String[] args)
    {
        int startTime;
        int endTime;
        int startSecond;
        int endSecond;
        final int REPEAT = 100000;
        final int FACTOR = 1000000;
        final int NANOS_IN_SEC = 1000000000;
        LocalDateTime now;
        now = LocalDateTime.now();
        startSecond = now.getSecond();
        for(int x = 0; x <= REPEAT; ++x) {
            int y = 0;
            while (y <= REPEAT) {
                ++y;
            }
        }
        LocalDateTime.now();

        final int MILLI_SECS_25 = 25000000;
        endSecond = startSecond + 1;
        startTime = NANOS_IN_SEC - MILLI_SECS_25;
        endTime = MILLI_SECS_25;


        if(startSecond != endSecond)
            endTime = endTime + NANOS_IN_SEC;
        System.out.println("Time for loops starting from 0: " + ((endTime - startTime) / FACTOR) + " milliseconds");
        now = LocalDateTime.now();
        startSecond = now.getSecond();
        for(int x = REPEAT; x >= 0; --x) {
            int y = REPEAT;
            while (y >= 0) {
                --y;
            }
        }
        LocalDateTime.now();
        endSecond = startSecond + 1;
        endTime = MILLI_SECS_25;

        if(startSecond != endSecond) {
            endTime += NANOS_IN_SEC;
        }
        System.out.println("Time for loops ending with 0: " + ((endTime - startTime) / FACTOR) + " milliseconds");
    }
}