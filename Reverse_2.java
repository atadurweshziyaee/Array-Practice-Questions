
//Write a java program to take input from user and store in an array and Now copy all element 
// to another array but in reverse order.
import java.util.Scanner;
import java.util.Arrays;

class Reverse_2 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element one by one :-");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int j = 0;
        for (int i = arr1.length - 1; i >= 0; i--) {
            arr2[j] = arr1[i];
            j++;
        }
        System.out.println("Your Reverse Element in another array is :- ");
        System.out.println(Arrays.toString(arr2));
    }
}