package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5, 6, 4, 3, 7, 8, 3};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }


    static public int[] selectionSort(int[] arr) {
        arr = selectionHelper(arr, 0, arr.length - 1);
        return arr;
    }

    static int[] selectionHelper(int[] arr, int curr, int last) {
        if (last == 0) {
            return arr;
        }

        if (curr < last) {
            int maxI = maxIndex(arr, 0, last, last);
            arr = swap(arr, maxI, last);
        }
        return selectionHelper(arr, 0, last - 1);
    }

    static int maxIndex(int[] arr, int curr, int last, int maxI) {

        if (arr[curr] > arr[maxI]) {
            maxI = curr;
        }

        if (curr == last) {
            return maxI;
        }

        return maxIndex(arr, curr + 1, last, maxI);
    }

    static public int[] swap(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
        return arr;
    }
}
