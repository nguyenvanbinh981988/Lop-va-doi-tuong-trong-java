import java.util.Scanner;

public class StopWatchMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int click = -1;
        StopWatch stopWatch1 = new StopWatch();

        while (click != 0) {
            System.out.println("menu");
            System.out.println("1 : start");
            System.out.println("2 : stop");
            click = input.nextInt();
            switch (click) {
                case 1:
                    stopWatch1.start();
                    break;
                case 2:
                    stopWatch1.stop();
                    System.out.println("Elapsed time in seconds: " + stopWatch1.getElapsedTime());
                    click = 0;
                    break;
                    }
            }
        }
    }


    class StopWatch {

        private long startTime = 0;
        private long endTime = 0;
        private boolean click = false;

        public StopWatch() {
            this.click = click;
        }

        public StopWatch(long startTime, long endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public void start() {
            this.startTime = System.currentTimeMillis();
            this.click = true;
        }

        public void stop() {
            this.endTime = System.currentTimeMillis();
            this.click = true;
        }

        public long getElapsedTime() {
            long time;
            if (this.click == true) {
                time = (System.currentTimeMillis() - this.startTime) / 1000;
            } else {
                time = (this.endTime - this.startTime) / 1000;
            }
            return time;
        }
    }

