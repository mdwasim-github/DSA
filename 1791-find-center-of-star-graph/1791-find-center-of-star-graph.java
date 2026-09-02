//T.C -> o(n);

// class Solution {
//     public int findCenter(int[][] edges) {
//         int n = edges.length + 1;
//         int[] degreeCount = new int[n + 1];

//         for (int[] edge : edges) {
//             degreeCount[edge[0]]++;
//             degreeCount[edge[1]]++;
//         }

//         for (int i = 1; i <= n; i++) {
//             if (degreeCount[i] == n - 1) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }



//T.C -> O(1)

class Solution {
    public int findCenter(int[][] edges) {
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        } else {
            return edges[0][1];
        }
    }
}


