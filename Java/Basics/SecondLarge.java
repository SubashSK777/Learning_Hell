public class Main {
  public static void main(String[] args) {
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
    int largest = ages[0];
    int secondLargest = Integer.MIN_VALUE;

    for (int age : ages) {
      if (age > largest) {
        secondLargest = largest;
        largest = age;
      } else if (age > secondLargest && age != largest) {
        secondLargest = age;
      }
    }
    return secondLargest;
  }
}
