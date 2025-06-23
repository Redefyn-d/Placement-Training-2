import java.util.Scanner;
public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        int left = 0, right = text.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) {
                right--;
            }
            if (text.charAt(left) != text.charAt(right)) {
                System.out.println(false);
                return;
            }
            left++;
            right--;
        }
        System.out.println(true);
        input.close();
    }
}
