package main.java.app.my;

public class ShellSort {
    static public int[] sort(int[] arr) {
    
        for (int d = arr.length / 2; d > 0; d /= 2) {
            for (int i = d; i < arr.length; i++) {
                for (int j = i; j >= d && arr[j - d] > arr[j]; j -= d) {
                    int temp = arr[j - d];
                    arr[j - d] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}