import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size1 = input.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = input.nextInt();
        }
        int size2 = input.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : array2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        for (int num : result) {
            System.out.print(num + " ");
        }
        input.close();
    }
}
