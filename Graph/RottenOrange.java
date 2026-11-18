package Graph;
// import java.util.*;

// class Triplet {
//     int row, col, time;

//     Triplet(int row, int col, int time) {
//         this.row = row;
//         this.col = col;
//         this.time = time;
//     }
// }

// public class RottenOrange {

//     static int[] dr = {-1, 1, 0, 0};
//     static int[] dc = {0, 0, -1, 1};

//     public static int orangesRotting(int[][] arr) {

//         Queue<Triplet> q = new LinkedList<>();

//         int m = arr.length;
//         int n = arr[0].length;

//         // Add all initially rotten oranges
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (arr[i][j] == 2) {
//                     q.add(new Triplet(i, j, 0));
//                 }
//             }
//         }

//         int maxTime = 0;

//         while (!q.isEmpty()) {

//             Triplet front = q.remove();

//             int row = front.row;
//             int col = front.col;
//             int time = front.time;

//             maxTime = Math.max(maxTime, time);

//             // Check four directions
//             for (int k = 0; k < 4; k++) {

//                 int nr = row + dr[k];
//                 int nc = col + dc[k];

//                 if (nr >= 0 && nr < m && nc >= 0 && nc < n) {

//                     if (arr[nr][nc] == 1) {

//                         arr[nr][nc] = 2;

//                         q.add(new Triplet(nr, nc, time + 1));
//                     }
//                 }
//             }
//         }

//         // Check if any fresh orange remains
//         for (int[] a : arr) {
//             for (int ele : a) {
//                 if (ele == 1) {
//                     return -1;
//                 }
//             }
//         }

//         return maxTime;
//     }

//     public static void main(String[] args) {

//         int[][] arr = {
//             {2, 1, 1},
//             {1, 1, 0},
//             {0, 1, 1}
//         };

//         System.out.println(orangesRotting(arr));
//     }
// }
//dfs
// import java.util.*;

// public class Main {

//     static int[] dr = {-1, 1, 0, 0};
//     static int[] dc = {0, 0, -1, 1};

//     public static int orangesRotting(int[][] arr) {

//         int m = arr.length;
//         int n = arr[0].length;

//         int[][] time = new int[m][n];

//         // Initially, all cells have infinite time
//         for (int[] row : time) {
//             Arrays.fill(row, Integer.MAX_VALUE);
//         }

//         // Start DFS from every initially rotten orange
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {

//                 if (arr[i][j] == 2) {
//                     dfs(i, j, 0, arr, time);
//                 }
//             }
//         }

//         int ans = 0;

//         // Check all initially fresh oranges
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {

//                 if (arr[i][j] == 1) {

//                     if (time[i][j] == Integer.MAX_VALUE) {
//                         return -1;
//                     }

//                     ans = Math.max(ans, time[i][j]);
//                 }
//             }
//         }

//         return ans;
//     }

//     static void dfs(int r, int c, int t,
//                     int[][] arr, int[][] time) {

//         int m = arr.length;
//         int n = arr[0].length;

//         if (r < 0 || r >= m || c < 0 || c >= n) {
//             return;
//         }

//         if (arr[r][c] == 0) {
//             return;
//         }

//         // If this cell was already reached in less time
//         if (t >= time[r][c]) {
//             return;
//         }

//         time[r][c] = t;

//         for (int k = 0; k < 4; k++) {

//             int nr = r + dr[k];
//             int nc = c + dc[k];

//             dfs(nr, nc, t + 1, arr, time);
//         }
//     }

//     public static void main(String[] args) {

//         int[][] arr = {
//             {2, 1, 1},
//             {1, 1, 0},
//             {0, 1, 1}
//         };

//         System.out.println(orangesRotting(arr));
//     }
// }