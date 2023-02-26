// Write a java program to count the positive, negative, even, odd and zero's number in an array.
public class CountPosNegEvenOddInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 8, 9, 10, 23, 54, -34, -23, 23, 0, 108, 0, 75, 99 };
        int countZero = 0, countPos = 0, countNeg = 0, countEven = 0, countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                countZero++;
            }
            if(arr[i]<0){
                countNeg++;
            }
            if(arr[i]>0){
                countPos++;
            }
            if(arr[i]%2==0){
                countEven++;
            }
            if(arr[i]%2!=0){
                countOdd++;
            }
            
        }
        System.out.println("There are "+countZero+" zero "+countPos+" positive number "+countNeg+" negative number "+countEven+" even number "+countOdd+" odd number ");
    }
}
