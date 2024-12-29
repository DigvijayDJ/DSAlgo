package arrays;
import java.lang.*;

public class MaxElement{
	static int maxEle(int[] arr){
		int n = arr.length;
		int Max = 0;
		
		for(int i=0; i<n;i++){
			if(Max<arr[i]){
				Max = arr[i];
			}
		}
		return Max;
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = {10, 324, 45, 90, 9808};
		System.out.println(maxEle(arr));
	}
}
