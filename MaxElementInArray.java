// Write a java prog to find the maximum number of an array.
public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 23, 54, 23, 108, 75, 99 };
        int value = Integer.MIN_VALUE;
        System.out.println("Enter the element one by one :-");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value) {
                value = arr[i];
            }
        }
        System.out.println("The maximum value of an array is " + value);
    }
}
