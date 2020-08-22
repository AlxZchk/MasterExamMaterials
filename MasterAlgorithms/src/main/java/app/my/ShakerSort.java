package main.java.app.my;

public class ShakerSort {
    public static int[] sort(int[] arr) {
        boolean swapped = false;

        for (int k = arr.length - 1; k > 0; k--) {
            swapped = false;
            for (int i = k; i > arr.length - 1 - k; i--) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }

            for (int i = arr.length - 1 - k; i < k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        return arr;
    }
}