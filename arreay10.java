class array10
{
	public static void main(String[]args)
	{
		int []arr={12,13,14,15,16};
		int sum=findArraySum(arr);
		System.out.println("array sum"+sum);
		int average=findArrayAverage(arr);
		System.out.println("array average :"+average);
		int large=findArrayLargestNumber(arr);
		System.out.println("ArrayLargestNumber :"+large);
		int smallest=findArraysmallestNumber(arr);
		System.out.println("ArraysmallestNumber :"+smallest);
	}
	static int findArraySum(int []arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	static int findArrayLargestNumber(int []arr)
	{
		int large=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
		return large;
	}
	static int findArraysmallestNumber(int []arr)
	{
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		return smallest;
	}
	static int findArrayAverage(int []arr)
	{
		int sum=findArraySum(arr);
		int average=sum/arr.length;
		return average;
	}
}