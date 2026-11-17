// package Graph;
// import java.util.*;

// class Pair  {
//     int a, b;

//     Pair(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }
// }

// class NoOfIsland {

//     static int[] dr = {-1, 1, 0, 0};
//     static int[] dc = {0, 0, -1, 1};

//     static void bfs(int i, int j, char[][] arr,
//                     boolean[][] visit) {

//         int m = arr.length;
//         int n = arr[0].length;

//         Queue<Pair> q = new LinkedList<>();

//         q.add(new Pair(i, j));
//         visit[i][j] = true;

//         while (!q.isEmpty()) {

//             Pair front = q.remove();

//             int row = front.a;
//             int col = front.b;

//             for (int k = 0; k < 4; k++) {

//                 int nr = row + dr[k];
//                 int nc = col + dc[k];

//                 if (nr >= 0 && nr < m &&
//                     nc >= 0 && nc < n) {

//                     if (!visit[nr][nc] &&
//                         arr[nr][nc] == '1') {

//                         q.add(new Pair(nr, nc));
//                         visit[nr][nc] = true;
//                     }
//                 }
//             }
//         }
//     }

//     static int numIslands(char[][] arr) {

//         int m = arr.length;
//         int n = arr[0].length;

//         boolean[][] visit = new boolean[m][n];

//         int count = 0;

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {

//                 if (arr[i][j] == '1' && !visit[i][j]) {

//                     bfs(i, j, arr, visit);
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }

//     public static void main(String[] args) {

//         char[][] arr = {
//             {'1','1','0','0'},
//             {'1','0','0','1'},
//             {'0','0','1','1'}
//         };

//         System.out.println(numIslands(arr));
//     }
// }

// dfs

// import java.util.*;

// class Main {

//     static int[] dr = {-1, 1, 0, 0};
//     static int[] dc = {0, 0, -1, 1};

//     static void dfs(int i, int j, char[][] arr,
//                     boolean[][] visit) {

//         visit[i][j] = true;

//         int m = arr.length;
//         int n = arr[0].length;

//         for (int k = 0; k < 4; k++) {

//             int nr = i + dr[k];
//             int nc = j + dc[k];

//             if (nr >= 0 && nr < m &&
//                 nc >= 0 && nc < n) {

//                 if (!visit[nr][nc] && arr[nr][nc] == '1') {
//                     dfs(nr, nc, arr, visit);
//                 }
//             }
//         }
//     }

//     static int numIslands(char[][] arr) {

//         int m = arr.length;
//         int n = arr[0].length;

//         boolean[][] visit = new boolean[m][n];

//         int count = 0;

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {

//                 if (arr[i][j] == '1' && !visit[i][j]) {

//                     dfs(i, j, arr, visit);
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }

//     public static void main(String[] args) {

//         char[][] arr = {
//             {'1','1','0','0'},
//             {'1','0','0','1'},
//             {'0','0','1','1'}
//         };

//         System.out.println(numIslands(arr));
//     }
// }


