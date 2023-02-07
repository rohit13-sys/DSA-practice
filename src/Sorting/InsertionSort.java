package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {0,-23,-56,-99,2,3,67};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    static int[] insertionSort(int[] arr){
        arr=insertionHelper(arr,0,1);
        return arr;
    }

    static int[] insertionHelper(int[] arr,int i,int j){
        if(i>arr.length-2){
            return arr;
        }

        if(i< arr.length-1 && j>0){
            if(arr[j-1]>arr[j]){
               swap(arr,j-1,j);
                return insertionHelper(arr,i,j-1);
            }else {
                return insertionHelper(arr,i+1,i+2);
            }

        }else {
            return insertionHelper(arr,i+1,i+2);
        }


    }

    static public int[] swap(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
        return arr;
    }
}
