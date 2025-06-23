import java.util.Scanner;
import java.util.HashSet;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0, left = 0;
        for (int right = 0; right < text.length(); right++) {
            while (set.contains(text.charAt(right))) {
                set.remove(text.charAt(left));
                left++;
            }
            set.add(text.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);
        input.close();
    }
}
