//Write a java program to reverse an array.
public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 8, 9, 10, 23, 54, 23, 108, 75, 99 };
        int start = 0;
        int end = arr.length - 1;
        System.out.println("Your array :-");
        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            while (start < end) {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }
        }
        System.out.println("\nAfter reversed:-");
        for (int a : arr) {
            System.out.print(a + ", ");
        }

    }
}
