import java.util.Scanner;
public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = input.nextInt();
        }
        int left = 0, right = size - 1;
        int maxArea = 0;
        while (left < right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxArea);
        input.close();
    }
}
