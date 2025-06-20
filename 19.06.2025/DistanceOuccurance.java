import java.util.Scanner;
public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        int target = input.nextInt();
        int left = 0, right = size - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
        input.close();
    }
}
