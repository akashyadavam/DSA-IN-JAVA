package Graph;
import java.util.*;

// class KeysRoom {

//     static boolean canVisitAllRooms(List<List<Integer>> rooms) {

//         int n = rooms.size();
//         boolean[] visit = new boolean[n];

//         Queue<Integer> q = new LinkedList<>();

//         q.add(0);
//         visit[0] = true;

//         while (!q.isEmpty()) {

//             int front = q.remove();

//             for (int ele : rooms.get(front)) {

//                 if (!visit[ele]) {
//                     q.add(ele);
//                     visit[ele] = true;
//                 }
//             }
//         }

//         for (boolean flag : visit) {
//             if (!flag) return false;
//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         List<List<Integer>> rooms = new ArrayList<>();

//         rooms.add(Arrays.asList(1, 3));
//         rooms.add(Arrays.asList(3, 0, 1));
//         rooms.add(Arrays.asList(2));
//         rooms.add(Arrays.asList(0));

//         System.out.println(canVisitAllRooms(rooms));
//     }
// }


// import java.util.*;

// class Main {

//     static void dfs(int i, boolean[] visit,
//                     List<List<Integer>> rooms) {

//         visit[i] = true;

//         for (int ele : rooms.get(i)) {

//             if (!visit[ele]) {
//                 dfs(ele, visit, rooms);
//             }
//         }
//     }

//     static boolean canVisitAllRooms(List<List<Integer>> rooms) {

//         int n = rooms.size();
//         boolean[] visit = new boolean[n];

//         dfs(0, visit, rooms);

//         for (boolean flag : visit) {
//             if (!flag) return false;
//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         List<List<Integer>> rooms = new ArrayList<>();

//         rooms.add(Arrays.asList(1, 3));
//         rooms.add(Arrays.asList(3, 0, 1));
//         rooms.add(Arrays.asList(2));
//         rooms.add(Arrays.asList(0));

//         System.out.println(canVisitAllRooms(rooms));
//     }
// }
