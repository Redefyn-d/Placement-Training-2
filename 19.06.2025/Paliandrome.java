import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int original = number;
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        System.out.println(original == reversed);
        input.close();
    }
}
