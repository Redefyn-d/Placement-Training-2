import java.util.Scanner;
import java.util.HashMap;
public class SubarraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        int target = input.nextInt();
        HashMap<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1);
        int currentSum = 0, count = 0;
        for (int num : numbers) {
            currentSum += num;
            if (sumCount.containsKey(currentSum - target)) {
                count += sumCount.get(currentSum - target);
            }
            sumCount.put(currentSum, sumCount.getOrDefault(currentSum, 0) + 1);
        }
        System.out.println(count);
        input.close();
    }
}
