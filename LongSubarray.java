/*
* Given an array of positive integers and a positive integer S, 
* find the length of the smallest contiguous subarray whose sum is greater than or equal to S. 
* Return 0 if no such subarray exists.
*
* Example:
* Input: list = [2, 1, 5, 2, 3, 2], S = 7
* Output: 2
* Explanation: The smallest subarray with a sum >= 7 is [5, 2] with length 2.
*/

public class LongSubarray {
    public static void main(String[] args) {

        int[] list = {2, 1, 5, 2, 3, 2};

        int S = 7;

        int windowStart = 0;

        int minLength = 0;

        int windowSum = 0;

        for(int windowEnd = 0; windowEnd < list.length; windowEnd++){
            windowSum += list[windowEnd];

            while (windowSum >= S) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);  
                windowSum -= list[windowStart];  
                windowStart++;
            }
        }
        System.out.println();
    }
}