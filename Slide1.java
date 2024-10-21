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
             * what i did is 
             */
            windowSum += arr[i] - arr[i - K];

        }

        
    }
    
}
