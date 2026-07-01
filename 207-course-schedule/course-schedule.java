class Solution {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[], int[][] arr) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        for(int i=0; i<arr.length; i++) {
            graph[arr[i][1]].add(new Edge(arr[i][1], arr[i][0]));
        }
    }
    public static boolean dfs(ArrayList<Edge> graph[], boolean vis[], boolean stack[], int curr) {
        vis[curr] = true;
        stack[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(stack[e.dest]) {
                return true;
            }
            if(!vis[e.dest]) {
                if(dfs(graph, vis, stack, e.dest)) {
                    return true;
                }
            }
        }
        stack[curr] = false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int V = numCourses;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph, prerequisites);

        boolean vis[] = new boolean[V];
        boolean stack[] = new boolean[V];

        for(int i = 0; i < V; i++) {
            if(!vis[i]) {
                if(dfs(graph, vis, stack, i)) {
                    return false; // cycle exists
                }
            }
        }
        return true;
    }
}