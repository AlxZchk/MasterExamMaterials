package main.java.app.my;

public class QuickSort {
    public static int[] sort(int[] arr, int left, int right) {
        int i = left;
        int j = right;

        int mid = (left + right) / 2;
        int x = arr[mid];

        do {
            while(arr[i] < x) {
                i++;
            }

            while(arr[j] > x) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

        } while(i < j);

        if (left < j) {
            QuickSort.sort(arr, left, j);
        }

        if (right > i) {
            QuickSort.sort(arr, i, right);
        }

        return arr;
    }
}