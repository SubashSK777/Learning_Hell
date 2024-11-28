class Main
{
	public static long getMinimumSum(int [] arr)
	{
		int n = arr.length;
		long minSum = Long.MAX_VALUE;
		int leftmin = Integer.MAX_VALUE;
		boolean found = false;
		for(int i = 1 ; i <= n-2; i++)
		{
		    leftmin = Math.min(leftmin, arr[i-1]);
		    if(arr[i] < leftmin)
		    {
		        continue;
		    }	
		    int rightmin = Integer.MAX_VALUE;
			for(int k = i+1; k<n ; k++)
			{
				if(arr[i] > arr[k])
					rightmin = Math.min(rightmin, arr[k]);
			}
			if(rightmin!= Integer.MAX_VALUE)
			{
				found = true;
				long sum = leftmin + arr[i] + rightmin;
				minSum = Math.min(minSum,sum);
			}
		}
		return minSum;
	}
	public static void main(String [] args)
	{
		int [] arr ={4, 5, 1, 2, 3, 1, 1};
		System.out.println(getMinimumSum(arr));
	}
}