import java.util.Scanner;

public class SecondMaxElementInArray{
    public static void main(String args[]){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // taking the size of the array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num = sc.nextInt();

        int[] arr = new int[num];

        // taking the input in an array.

        for(int i=0;i<arr.length;i++){
            System.out.print("arr["+i+"]"+ "= ");
            arr[i] = sc.nextInt();
        }

        // logic building for second max and max element in an array.

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }

        // printing the First max and Second max number.

        System.out.println("second max number in the array is "+ secondMax);
        System.out.println("max number in the array is "+ max);

    }
}