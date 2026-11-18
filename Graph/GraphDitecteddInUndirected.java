package Graph;
import java.util.*;
class Pair {
    int a, b;
    Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
class Graph {
    static boolean bfs(int j, boolean visit[], ArrayList<ArrayList<Integer>> adj) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(j, -1));
        visit[j] = true;

        while (!q.isEmpty()) {
            Pair front = q.remove();

            int curr = front.a;
            int parent = front.b;

            for (int ele : adj.get(curr)) {

                if (!visit[ele]) {
                    visit[ele] = true;
                    q.add(new Pair(ele, curr));
                }
                else if (parent != ele) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean visit[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                if (bfs(i, visit, adj)) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class GraphDitecteddInUndirected {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        // Undirected edges
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(1);
        adj.get(1).add(3);
        Graph obj = new Graph();
        System.out.println(obj.isCycle(adj));
    }
}

