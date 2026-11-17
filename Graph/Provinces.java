// package Graph;
// import java.util.*;

// public class Provinces {
//     static int bfs(int[][] arr) {
//         int n = arr.length;
//         boolean[] visit = new boolean[n];
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             if (!visit[i]) {
//                 Queue<Integer> q = new LinkedList<>();
//                 q.add(i);
//                 visit[i] = true;
//                 while (!q.isEmpty()) {
//                     int front = q.remove();
//                     for (int j = 0; j < n; j++) {
//                         if (arr[front][j] == 1 && !visit[j]) {
//                             q.add(j);
//                             visit[j] = true;
//                         }
//                     }
//                 }
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int[][] arr = {
//             {1, 1, 0},
//             {1, 1, 0},
//             {0, 0, 1}
//         };
//         System.out.println(bfs(arr));
//     }
// }

//dfs code 

// import java.util.*;

// class Main {

//     static int count = 0;

//     static void dfs(int i, int[][] arr, boolean[] visit) {

//         visit[i] = true;

//         for (int j = 0; j < arr.length; j++) {

//             if (arr[i][j] == 1 && !visit[j]) {
//                 dfs(j, arr, visit);
//             }
//         }
//     }

//     static int findCircleNum(int[][] arr) {

//         int n = arr.length;
//         boolean[] visit = new boolean[n];
//         int count = 0;

//         for (int i = 0; i < n; i++) {

//             if (!visit[i]) {
//                 dfs(i, arr, visit);
//                 count++;
//             }
//         }

//         return count;
//     }

//     public static void main(String[] args) {

//         int[][] arr = {
//             {1, 1, 0},
//             {1, 1, 0},
//             {0, 0, 1}
//         };

//         System.out.println(findCircleNum(arr));
//     }
// }
