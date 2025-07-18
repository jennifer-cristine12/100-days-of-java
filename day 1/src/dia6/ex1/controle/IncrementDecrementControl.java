package dia6.ex1.controle;

public class IncrementDecrementControl {
    public int Increment(int num) {
        int numInc = num;
        numInc += 1;
        return numInc;
    }

    public int Decrement(int num) {
        int numDec = num;
        numDec -= 1;
        return numDec;
    }

    public void Timer(int min) {
        int totalSec = min * 60;

        while (totalSec > 0) {
            int displayMin = totalSec / 60;
            int displaySec = totalSec % 60;

            System.out.printf("%02d:%02d\n", displayMin, displaySec);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            totalSec--;
        }

        System.out.println("Acabou o tempo");
    }

    public int multiplicador(int num, int multiplicador) {
        num *= multiplicador+1;
        return num;

    }

    public void StopWatch() {

        int milli = 0, sec = 0, min = 0, hour = 0;
        while (true) {
            milli++;
            if (milli == 1000) {
                sec++;
                milli = 0;
            }
            if (sec == 60) {
                min++;
                sec = 0;
            }
            if (min == 60) {
                hour++;
                min = 0;
            }
            System.out.println(hour + ":" + min + ":" + sec + ":" + milli);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
