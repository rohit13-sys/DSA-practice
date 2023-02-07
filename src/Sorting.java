import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 3, 7, 8, 3};
//        System.out.println(Arrays.toString(bubbleSort(arr)));
//        System.out.println(Arrays.toString((maxNum(arr,0,arr.length-1))));
//        System.out.println(maxIndex(arr,0,arr.length-1));
        System.out.println(Arrays.toString(selectionSort(arr)));
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
