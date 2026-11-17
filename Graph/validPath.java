// package Graph;
// import java.util.*;
// class Main {
//     static boolean validPath(int n, int[][] edges,
//                              int src, int des) {
//         List<List<Integer>> adj = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             adj.add(new ArrayList<>());
//         }
//         // Creating undirected graph
//         for (int[] edge : edges) {
//             int u = edge[0];
//             int v = edge[1];
//             adj.get(u).add(v);
//             adj.get(v).add(u);
//         }
//         boolean[] visit = new boolean[n];
//         Queue<Integer> q = new LinkedList<>();
//         q.add(src);
//         visit[src] = true;
//         while (!q.isEmpty()) {
//             int front = q.remove();
//             if (front == des) return true;
//             for (int ele : adj.get(front)) {
//                 if (!visit[ele]) {
//                     q.add(ele);
//                     visit[ele] = true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {

//         int n = 6;

//         int[][] edges = {
//             {0,1},
//             {0,2},
//             {3,4},
//             {4,5},
//             {3,5}
//         };

//         int src = 0;
//         int des = 2;

//         System.out.println(validPath(n, edges, src, des));
//     }
// }

//dfs



// import java.util.*;

// class Main {

//     static void dfs(int src, int des,
//                     boolean[] visit,
//                     List<List<Integer>> adj) {

//         visit[src] = true;

//         for (int ele : adj.get(src)) {

//             if (!visit[ele]) {
//                 dfs(ele, des, visit, adj);
//             }
//         }
//     }

//     static boolean validPath(int n, int[][] edges,
//                              int src, int des) {

//         List<List<Integer>> adj = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
//             adj.add(new ArrayList<>());
//         }

//         for (int[] edge : edges) {

//             int u = edge[0];
//             int v = edge[1];

//             adj.get(u).add(v);
//             adj.get(v).add(u);
//         }

//         boolean[] visit = new boolean[n];

//         dfs(src, des, visit, adj);

//         return visit[des];
//     }

//     public static void main(String[] args) {

//         int n = 6;

//         int[][] edges = {
//             {0,1},
//             {0,2},
//             {3,4},
//             {4,5},
//             {3,5}
//         };

//         int src = 0;
//         int des = 2;

//         System.out.println(validPath(n, edges, src, des));
//     }
// }
