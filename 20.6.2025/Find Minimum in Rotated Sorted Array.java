import java.util.Scanner;
public class MinInRotatedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        int left = 0, right = size - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println(numbers[left]);
        input.close();
    }
}
