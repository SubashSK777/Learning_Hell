class OptimalMiddle
{
	public static long getMinimumSum(int [] arr)
	{
		int n = arr.length;
		long minSum = Long.MAX_VALUE;
		boolean found = false;
		for(int i = 1 ; i <= n-2; i++)
		{
			int leftmin = Integer.MAX_VALUE;
			for(int j = 0; j < i; j++)
			{
				if(arr[i] > arr[j])
					leftmin = Math.min(leftmin, arr[j]);
			}
			int rightmin = Integer.MAX_VALUE;
			for(int k = i+1; k < n ; k++)
			{
				if(arr[i] > arr[k])
					rightmin = Math.min(rightmin, arr[k]);
			}
			if(leftmin!= Integer.MAX_VALUE && rightmin!= Integer.MAX_VALUE)
			{
				found = true;
				long sum = leftmin + arr[i] + rightmin;
				minSum = Math.min(minSum,sum);
			}
		}
		return found?minSum:-1;
	}
	public static void main(String [] args)
	{
		int [] arr ={4, 5, 1, 2, 3, 1, 1};
		System.out.println(getMinimumSum(arr));
	}
}
