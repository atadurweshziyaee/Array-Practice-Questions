// write a program in java that find the max number and second max number in the array.

import java.util.Scanner;

public class SecondMaxElementInArray {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // how much size you required in the array.
        
        System.out.println("Enter the size of the array");
        int num = sc.nextInt();

        int[] arr = new int[num];
        int secondMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        // Taking the input in array.

        for(int i=0;i<arr.length;i++){
            System.out.print("arr["+i+"]"+ "= ");
            arr[i] = sc.nextInt();
            System.out.println();
        }

        // finding the max and second max number in the array.

        for(int i=0;i<arr.length;i++){
            max = arr[i];
            for(int j=0;j<arr.length;j++){
                if(arr[j] > max){
                    secondMax = max;
                    max = arr[j];
                }
            }
        }
        
        // finally we got the second max and max number in the array.

        System.out.println("second max number in the array is "+ secondMax);
        System.out.println("max number in the array is "+ max);
    }
}
