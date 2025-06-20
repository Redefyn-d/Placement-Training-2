import java.util.Scanner;
public class PlusOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] digits = new int[size];
        for (int i = 0; i < size; i++) {
            digits[i] = input.nextInt();
        }
        for (int i = size - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                for (int digit : digits) {
                    System.out.print(digit + " ");
                }
                return;
            }
            digits[i] = 0;
        }
        int[] result = new int[size + 1];
        result[0] = 1;
        for (int digit : result) {
            System.out.print(digit + " ");
        }
        input.close();
    }
}
