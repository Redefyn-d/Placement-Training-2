import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        int operations = input.nextInt();
        for (int i = 0; i < operations; i++) {
            String operation = input.next();
            if (operation.equals("push")) {
                int value = input.nextInt();
                queue2.add(value);
                while (!queue1.isEmpty()) {
                    queue2.add(queue1.remove());
                }
                Queue<Integer> temp = queue1;
                queue1 = queue2;
                queue2 = temp;
            } else if (operation.equals("pop")) {
                if (!queue1.isEmpty()) {
                    System.out.println(queue1.remove());
                } else {
                    System.out.println(-1);
                }
            }
        }
        input.close();
    }
}
