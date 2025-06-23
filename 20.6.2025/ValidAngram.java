import java.util.Scanner;
public class ValidAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        if (first.length() != second.length()) {
            System.out.println(false);
            return;
        }
        int[] count = new int[26];
        for (char c : first.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : second.toCharArray()) {
            count[c - 'a']--;
        }
        for (int num : count) {
            if (num != 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        input.close();
    }
}
