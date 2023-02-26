
//Write a Java program to count the number of even and odd elements in a given array
import java.util.Scanner;

public class CountEvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, evenCount = 0, oddCount = 0;
        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 23, 54, 23, 75, 99 };
        System.out.println("Enter the element one by one :-");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {

            }
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
        System.out.println("Total no of even number is " + evenCount + " and odd number is " + oddCount);

    }
}
