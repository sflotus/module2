package Exercices.ss4_class_object.stop_watch;

import java.util.Random;
import java.util.Scanner;

public class StopWatch {
    private long startTime, endTime;

    StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài mãng:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
        StopWatch watch = new StopWatch();
        watch.star();
        sortArr(arr);
        watch.end();
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
