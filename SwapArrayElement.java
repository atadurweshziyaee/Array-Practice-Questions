// Write a Java program to swap the first and last elements of an array and create a new array.
import java.util.Scanner;
public class SwapArrayElement{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array:-");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element one by one :-");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int element = arr[0];
            arr[0] = arr[n-1];
            arr[n-1] = element;
        }
        System.out.println("Your element is :-");
        for(int a : arr){
            System.out.print(" "+a);
        }
    }
}