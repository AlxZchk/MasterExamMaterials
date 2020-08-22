package main.java.app.my;

import java.util.List;
import java.util.stream.Collectors;

public class SelectionSort {
    static public int[] sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }

    public List<String> search(List<String> list) {
        return list.stream()
        .filter((String str) -> { return str.charAt(0) == 'a'; })
        .filter((String str) -> { return str.length() == 3; })
        .collect(Collectors.toList());
    }
}