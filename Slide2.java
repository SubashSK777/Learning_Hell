public class Slide2 {
    public static void main(String[] args) {
        int [] arr = {1, 0, 0, 0, 1, 1, 1, 0, 0, 1};

        int K = 3;

        int windowStart = 0; // Start of the sliding window

        int maxOnesCount = 0; // To keep track of the number of 1s in the current window
        
        int maxLength = 0; // To store the maximum length of 1s sequence

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
/*the for loop works like this for("variable"; for loop length; iterative action)
* here i first defined what variable i will work on it is "windowEnd", so the windowEnd will start from its index 0
* i defined it as int windowEnd = 0;. then for the length I defined window < arr.length. this will stop the loop at the 
*length of the arr i have defined above. the arr index is 9. so it will loop 9 times.    */            
            if(arr[windowEnd] == 1){
                maxOnesCount++;
            }

        }

    }
    
}
