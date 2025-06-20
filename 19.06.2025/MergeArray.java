import java.util.Scanner;
public class MergeSortedArrays {
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
        int[] result = new int[size1 + size2];
        int i = 0, j = 0, k = 0;
        while (i < size1 && j < size2) {
            if (array1[i] <= array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }
        while (i < size1) {
            result[k++] = array1[i++];
        }
        while (j < size2) {
            result[k++] = array2[j++];
        }
        for (int num : result) {
            System.out.print(num + " ");
        }
        input.close();
    }
}
