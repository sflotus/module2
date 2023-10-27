package Exercices.ss4_class_object.stop_watch;

import java.util.Random;

public class StopWatch {
    private long startTime, endTime;

    StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000000);
        }
        StopWatch watch = new StopWatch();
        watch.getStartTime();
        sortArr(arr);
        watch.getEndTime();
        System.out.println("Thời gian thực thi: " + watch.getElapsedTime());
    }

    public static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void star() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
