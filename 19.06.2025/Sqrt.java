import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number == 0) {
            System.out.println(0);
            return;
        }
        long left = 1, right = number;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == number) {
                System.out.println(mid);
                return;
            } else if (mid * mid < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(right);
        input.close();
    }
}
