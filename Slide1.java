class Slide1 {
    public static void main(String[] args) {
        int []  arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};

        int K = 3;

        int maxSum = 0;

        int windowSum = 0;

        for (int i = 0; i < K; i++){

            windowSum += arr[i];
        }

        maxSum = windowSum;

        for (int i = K; i < arr.length; i++){

/* So the sliding window is easy
* I must first add the next element of the array which is arr[i]
* i added it, now i must remove the last element
* what i did is subtract the current index of the element with the K
* K is the maxWindow Limit
* say now {1, 3, 5, 7, 9, 2, 4, 6, 8} is the the array i use. 
* at 1st iteration: index 0,1,2 will be covered which is {1, 3, 5} = 9
* at 2nd: index 3 will be added, which is 7. K max limit is 3; so i must remove 1 from the array
* here arr[i] is the added element's index. and for the removeal we use arr[i - K],
* which is the added index will subtract the maxLimit; 3-3; arr[i-K];
* arr[i - K] is 0, then we will remove the element of 0th index now
* this process is repeated at 3rd iteration, index 4 which is arr[i] is added;
* i = 4, K = 3; arr[i - K] = arr[4 - 3] = 1; now index 1 will be removed and replaced with index 4;
*/
            windowSum += arr[i] - arr[i - K];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }

        }
        
        System.out.println("Maximun Sum of Subarray of Size K: "+maxSum);
        
    }
    
}
