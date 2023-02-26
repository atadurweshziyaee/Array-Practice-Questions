// Write a java program to take a user input array and print the array of all element. 
import java.util.Scanner;
public class UserInptArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the element one by one :-");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your element is :-");
        for(int a : arr){
            System.out.print(" "+a);
        }

    }
}