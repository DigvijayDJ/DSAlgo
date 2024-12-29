package arrays;

public class MoveArraysToEnd {
    public static void main(String[] args){
        int[] arr = {0,1,0,4,12};
        int len = arr.length;
        moveZeros(arr, len);
    }

    public static void moveZeros(int[] arr, int n){
        int j = -1;

        for(int i=0; i<n; i++){
            if (arr[i] == 0){
                j = i;
                break;
            }
        }

        if (j == -1) return;

        // Move non-zero elements to the position of zeros
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    // need to pass array as well as java passes primitive types as value not reference.
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
