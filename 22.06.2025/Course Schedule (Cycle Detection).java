import java.util.Scanner;
import java.util.ArrayList;
public class CourseSchedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int courses = input.nextInt();
        int prerequisites = input.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[courses];
        for (int i = 0; i < courses; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < prerequisites; i++) {
            int course = input.nextInt();
            int prereq = input.nextInt();
            graph[course].add(prereq);
        }
        int[] visited = new int[courses];
        for (int i = 0; i < courses; i++) {
            if (visited[i] == 0 && hasCycle(graph, i, visited)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        input.close();
    }
    static boolean hasCycle(ArrayList<Integer>[] graph, int node, int[] visited) {
        if (visited[node] == 1) return true;
        if (visited[node] == 2) return false;
        visited[node] = 1;
        for (int neighbor : graph[node]) {
            if (hasCycle(graph, neighbor, visited)) {
                return true;
            }
        }
        visited[node] = 2;
        return false;
    }
}
