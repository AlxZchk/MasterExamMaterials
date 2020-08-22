package main.java.app.my;

import java.util.Arrays;

public class BarrierSearch {
    public static int search(int[] arr, int key) {
        int[] tempArr = Arrays.copyOf(arr, arr.length + 1);
        tempArr[tempArr.length - 1] = key;

        int i = 0;
        while(tempArr[i] != key) {
            i++;
        }

        if (i == tempArr.length - 1) return -1;
        else return i;
    }
}