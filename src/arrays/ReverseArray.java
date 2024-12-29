package arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int len = arr.length;
        reverseArray(arr, len);
    }

    public static void reverseArray(int[] arr, int n){
        int i = 0;
        int j = n-1;
        while (i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }

        for(int x : arr){
            System.out.print(x +" ");
        }
    }
}
