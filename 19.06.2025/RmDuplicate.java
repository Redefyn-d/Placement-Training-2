import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        int newLength = 1;
        for (int i = 1; i < size; i++) {
            if (numbers[i] != numbers[newLength - 1]) {
                numbers[newLength] = numbers[i];
                newLength++;
            }
        }
        System.out.println(newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(numbers[i] + " ");
        }
        input.close();
    }
}
