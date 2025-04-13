import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {9,1,8,2,7,3,6,4,5};
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
