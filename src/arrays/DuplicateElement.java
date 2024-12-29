package arrays;
import java.lang.*;



public class DuplicateElement {
	
	static void DuplicateElement(int[] arr, int n){
		for(int i=0;i<n;i++){
			if(arr[Math.abs(arr[i])]>=0){
				arr[Math.abs(arr[i])] = (-1)*arr[Math.abs(arr[i])];
			}
			else
			{
				System.out.println(Math.abs(arr[i]));
			}
		}
	}
	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int[] arr = {1, 2, 3, 1, 3, 6, 6};
		int n = arr.length;
		DuplicateElement(arr,n);
		
	}
}
