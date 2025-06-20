import java.util.Scanner;
public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stairs = input.nextInt();
        int[] ways = new int[stairs + 1];
        if (stairs <= 1) {
            System.out.println(1);
            return;
        }
        ways[0] = 1;
        ways[1] = 1;
        for (int i = 2; i <= stairs; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }
        System.out.println(ways[stairs]);
        input.close();
    }
}
