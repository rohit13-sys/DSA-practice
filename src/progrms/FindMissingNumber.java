package progrms;

//this is program of cyclic sort
//Given an array nums containing n distinct numbers in the range [0, n]
//return the only number in the range that is missing from the array.
//https://leetcode.com/problems/missing-number/
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr={4,0,1,2};
        int num=missingNumber(arr);
        System.out.println(num);
    }

    static int missingNumber(int[] nums){
        int i=0;
        while(i<nums.length){
            //starts from zero
            int correct=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index){
                return index;
            }
        }

        return nums.length;
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
