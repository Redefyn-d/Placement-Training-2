import java.util.Scanner;
public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        int[] result = new int[size];
        result[0] = 1;
        for (int i = 1; i < size; i++) {
            result[i] = result[i - 1] * numbers[i - 1];
        }
        int rightProduct = 1;
        for (int i = size - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= numbers[i];
        }
        for (int num : result) {
            System.out.print(num + " ");
        }
        input.close();
    }
}
