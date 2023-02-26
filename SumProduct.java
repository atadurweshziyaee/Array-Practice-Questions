//Write a program to find the sum and product of all elements of an array.

public class SumProduct {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7 };
        int sum = 0;
        long product = 1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            product = product * arr[i];
        }
        System.out.println("The sum of all element in an array " + sum);
        System.out.println("The product of all element in an array " + product);
    }
}
