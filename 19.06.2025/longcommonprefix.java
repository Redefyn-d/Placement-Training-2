import java.util.Scanner;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        input.nextLine();
        String[] words = new String[count];
        for (int i = 0; i < count; i++) {
            words[i] = input.nextLine();
        }
        if (count == 0) {
            System.out.println("");
            return;
        }
        String prefix = words[0];
        for (int i = 1; i < count; i++) {
            while (words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("");
                    return;
                }
            }
        }
        System.out.println(prefix);
        input.close();
    }
}
