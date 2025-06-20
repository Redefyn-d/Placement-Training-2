import java.util.Scanner;
public class MaxSubarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        int maxSum = numbers[0];
        int currentSum = numbers[0];
        for (int i = 1; i < size; i++) {
            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
        input.close();
    }
}
