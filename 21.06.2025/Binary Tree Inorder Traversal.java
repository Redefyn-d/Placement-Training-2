import java.util.Scanner;
import java.util.ArrayList;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}
public class InorderTraversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        ArrayList<TreeNode> nodes = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nodes.add(new TreeNode(input.nextInt()));
        }
        for (int i = 0; i < size; i++) {
            int leftIndex = input.nextInt();
            int rightIndex = input.nextInt();
            if (leftIndex != -1) {
                nodes.get(i).left = nodes.get(leftIndex);
            }
            if (rightIndex != -1) {
                nodes.get(i).right = nodes.get(rightIndex);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        inorder(nodes.get(0), result);
        for (int val : result) {
            System.out.print(val + " ");
        }
        input.close();
    }
    static void inorder(TreeNode node, ArrayList<Integer> result) {
        if (node == null) return;
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }
}
