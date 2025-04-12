// Collections.sort impl in java uses merge sort technique

import java.util.Arrays;

class MergeSort {
    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    private static void mergeSort(int[] nums, int low, int high){
        if (low>=high) return;
        int mid = low+(high-low)/2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1,high);
        merge(nums, low, mid, high);
    }

    private static void merge(int[]nums, int low, int mid, int high){
        int l1 = mid-low+1, l2 = high-mid;
        int[] arr1 = new int[l1], arr2 = new int[l2];
        for(int i=0; i<l1; i++) arr1[i] = nums[low+i];
        for(int i=0; i<l2; i++) arr2[i] = nums[mid+1+i];
        
        int i=0, j=0, k=low;
        while(i<l1 && j<l2)
            if (arr1[i]<=arr2[j]) nums[k++] = arr1[i++];
            else nums[k++] = arr2[j++];
        while(i<l1) nums[k++] = arr1[i++];
        while(j<l2) nums[k++] = arr2[j++];
    }

    public static void main(String[] args){
        int[] arr = {5,2,6,9,3,1};
        System.out.println(Arrays.toString(sortArray(arr)));
    } 
} 