package arrays;


public class MinSumSubArray {
	
	static int MinSum(int[] arr, int k){
		int sum = 0;
		int ind_a = 0;
		int ind_b = k-1;
		for(int i=0;i<k;i++){
			sum = sum+arr[i];
		}
		int curr = sum;
		for(int i=k;i<arr.length;i++){
			curr = curr + arr[i] - arr[i-k];
			if(curr<sum){
				sum = curr;
				ind_a = ind_b-k; //this index is not right??
				ind_b = i;
				//ind_a = i-k;
				
			}
		}
		System.out.println("Min_index :"+ ind_a);
		System.out.println("Max_index :"+ ind_b);
		
		return sum;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = {10,4,3,5,6,3,8,1};
		int k = 3;
		
		//int res = MinSum(arr,k);
		System.out.print(MinSum(arr,k));
	}
}
