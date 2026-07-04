class Solution {

    int ans = Integer.MAX_VALUE;
    boolean[] visited;

    public int minScore(int n, int[][] roads) {

        ArrayList<int[]>[] graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int w = road[2];

            graph[u].add(new int[]{v, w});
            graph[v].add(new int[]{u, w});
        }

        visited = new boolean[n + 1];

        dfs(1, graph);

        return ans;
    }

    private void dfs(int node, ArrayList<int[]>[] graph) {

        visited[node] = true;

        for (int[] neighbour : graph[node]) {

            int next = neighbour[0];
            int weight = neighbour[1];

            ans = Math.min(ans, weight);

            if (!visited[next]) {
                dfs(next, graph);
            }
        }
    }
}