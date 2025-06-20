import java.util.Scanner;
public class LastWordLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] words = text.trim().split("\\s+");
        System.out.println(words[words.length - 1].length());
        input.close();
    }
}
