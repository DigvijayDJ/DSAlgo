package arrays;

public class SecondMaxInArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,50, 29};
        int len = arr.length;
        secondMax(arr, len);
    }

    public static void secondMax(int[] arr, int n){
        int max = 0;
        int secondMax = -1;

        for(int i =0; i<n;i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]< max && arr[i]>secondMax){
                secondMax = arr[i];
            }
        }

        System.out.println("Second Max Element : "+ secondMax);
    }
}
