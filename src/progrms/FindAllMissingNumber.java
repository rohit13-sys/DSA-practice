package progrms;

import java.util.ArrayList;
import java.util.List;

//this is program of cyclic sort
//Given an array nums containing n distinct numbers in the range [1, n]
//return the only number in the range that is missing from the array.
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllMissingNumber {

    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(missingNumber(arr));
    }

    static List<Integer> missingNumber(int[] nums){
        List<Integer> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            //starts from zero
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                list.add(index+1);
            }
        }

        return list;
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
