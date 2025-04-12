import java.util.Arrays;

public class QuickSort {
    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }
    private static void quickSort(int[] nums, int low, int high){
        if(low>=high) return;
        int pivotIdx = partition(nums, low, high);
        quickSort(nums, low, pivotIdx-1);
        quickSort(nums, pivotIdx+1, high);
    }

    private static int partition(int[] nums, int low, int high){
        int pivot = nums[low];
        int i = low, j = high;
        while(i<j){
            while(i<=high && nums[i]<=pivot ) i++;
            while(j>=low && nums[j]>pivot) j--;
            if(i<j) swap(nums, i, j);
        }
        swap(nums, low, j);
        return j;

    } 

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;  
    }

    public static void main(String[] agrs){
        int[] arr = {5,2,6,9,3,1};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
}
