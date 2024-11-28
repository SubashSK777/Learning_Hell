public class ArrayforAll {
    public static void main(String[] args) {
        // Create an array of Object type
        Object[] mixedArray = new Object[9];

        // Storing various data types
        mixedArray[0] = (byte) 1;          // byte
        mixedArray[1] = (short) 10;        // short
        mixedArray[2] = 100;               // int
        mixedArray[3] = 1000L;             // long
        mixedArray[4] = 1.1f;              // float
        mixedArray[5] = 10.01;             // double
        mixedArray[6] = 'A';               // char
        mixedArray[7] = true;              // boolean
        mixedArray[8] = "Hello, World!";   // String

        // Iterate through and print the elements
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.println(mixedArray[i]);
        }
    }
}
