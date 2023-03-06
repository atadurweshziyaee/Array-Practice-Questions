
//Write a java program to find the array is palindrome or not.
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        boolean flag = true;
        System.out.println("Enter the element one by one :-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int end = arr.length;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[end - i - 1]) {
                flag = true;
            } else {
                flag = false;
            }
        }
        if (flag == true)
            System.out.println("Array is palindrome");
        else
            System.out.println("Array is not palindrome");
    }
}
