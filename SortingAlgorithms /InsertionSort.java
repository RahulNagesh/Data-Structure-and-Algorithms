import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {9,1,8,2,7,3,6,4,5};
        int n = arr.length;
        for(int i=1; i<n; i++){
            int j = i-1;
            int key = arr[i];
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
