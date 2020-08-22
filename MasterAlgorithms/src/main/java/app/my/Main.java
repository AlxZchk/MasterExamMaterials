package main.java.app.my;

import java.util.Arrays;

class Main {
    public static void main(String args[]) {
        System.out.println("Hello!");
        int arr[] = { 12, 11, 13, 5, 6 }; 
        System.out.println(Arrays.toString(arr));
        int index = BarrierSearch.search(arr, 13);
        int sorted[] = QuickSort.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sorted));
        System.out.println(index);
    }
}