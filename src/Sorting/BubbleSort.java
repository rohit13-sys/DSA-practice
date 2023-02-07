package Sorting;

import java.util.Arrays;

public class BubbleSort {



    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 3, 7, 8, 3};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static public int[] bubbleSort(int[] arr) {
        int[] ans = helperBubble(arr, 0, 1, 0);
        return ans;
    }

    static int[] helperBubble(int[] arr, int i, int j, int c) {
        if (i == arr.length - 1 && c < arr.length - 1) {
            return helperBubble(arr, 0, 1, c + 1);
        }

        if (c < arr.length - 1) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        if (c == arr.length - 1) {
            return arr;
        }

        return helperBubble(arr, j, j + 1, c);

    }
}
