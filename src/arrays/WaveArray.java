package arrays;

public class WaveArray {
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int[] WaveArr(int[] arr, int size){
        for(int i =0; i<size;i+=2){
            if(i==0 && arr[i]>arr[1]){
                swap(arr, i, i+1);
            }

            if(i>0 && arr[i]>arr[i-1]){
                swap(arr,i,i-1);
            }

            if(i<size-1 && arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }



        }
        return arr;
    }


    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        int[] arr = {1,3,6,4,7,8,9,5,2};
        int size = arr.length;
        int[] res = WaveArr(arr,size);
        for(int i = 0;i<size; i++){
            System.out.println(res[i]);
        }
    }
}

