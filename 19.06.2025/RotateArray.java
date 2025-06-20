import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        int steps = input.nextInt();
        steps = steps % size;
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[(i + steps) % size] = numbers[i];
        }
        for (int num : temp) {
            System.out.print(num + " ");
        }
        input.close();
    }
}
