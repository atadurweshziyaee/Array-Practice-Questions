import java.util.Scanner;

public class SecondMinElementInArray {

    public static void main(String args[]){
        
        // taking the size of the array.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        int num = sc.nextInt();

        // array declaration.

        int[] arr = new int[num];

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        // taking the input of element in the array.

        System.out.println("Enter the element to be inserted in an array;");

        for(int i=0;i<arr.length;i++){
            System.out.print("arr["+i+"]"+ "= ");
            arr[i] = sc.nextInt();
        }

        // finding the second min element and min element in the array.
        // logic of finding the second min number in the array.

        
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i] < secondMin && arr[i] != min){
                secondMin = arr[i];
            }
        }
        

        // printing the answers of min and second min element in the array.

        System.out.println("second min number in the array is "+ secondMin);
        System.out.println("min number in the array is "+ min);
        

    }
}
