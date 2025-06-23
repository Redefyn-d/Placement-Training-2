import java.util.Scanner;
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        int[] lengths = new int[size];
        for (int i = 0; i < size; i++) {
            lengths[i] = 1;
            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[j]) {
                    lengths[i] = Math.max(lengths[i], lengths[j] + 1);
                }
            }
        }
        int maxLength = 0;
        for (int len : lengths) {
            maxLength = Math.max(maxLength, len);
        }
        System.out.println(maxLength);
        input.close();
    }
}
