import java.util.HashSet;
import java.util.Scanner;
public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (!set.add(num)) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
        input.close();
    }
}
