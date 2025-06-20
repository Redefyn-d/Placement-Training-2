import java.util.Scanner;
public class MoveZeroes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        int nonZeroPos = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] != 0) {
                numbers[nonZeroPos++] = numbers[i];
            }
        }
        while (nonZeroPos < size) {
            numbers[nonZeroPos++] = 0;
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        input.close();
    }
}
