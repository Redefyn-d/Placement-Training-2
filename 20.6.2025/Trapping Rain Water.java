import java.util.Scanner;
public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = input.nextInt();
        }
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];
        leftMax[0] = heights[0];
        for (int i = 1; i < size; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }
        rightMax[size - 1] = heights[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
        }
        int water = 0;
        for (int i = 0; i < size; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - heights[i];
        }
        System.out.println(water);
        input.close();
    }
}
