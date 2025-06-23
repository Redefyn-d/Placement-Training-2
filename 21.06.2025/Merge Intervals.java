import java.util.Scanner;
import java.util.Arrays;
public class MergeIntervals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[][] intervals = new int[count][2];
        for (int i = 0; i < count; i++) {
            intervals[i][0] = input.nextInt();
            intervals[i][1] = input.nextInt();
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int index = 0;
        for (int i = 1; i < count; i++) {
            if (intervals[index][1] >= intervals[i][0]) {
                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
            } else {
                index++;
                intervals[index][0] = intervals[i][0];
                intervals[index][1] = intervals[i][1];
            }
        }
        for (int i = 0; i <= index; i++) {
            System.out.println(intervals[i][0] + " " + intervals[i][1]);
        }
        input.close();
    }
}
