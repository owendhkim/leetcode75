public class num_province_graph
{
    public int findCircleNum(int[][] isConnected)
    {
        int n = isConnected.length;
        boolean[] v = new boolean[n];
        int count = 0;

        for(int i = 0; i < n; i++)
        {
            if(!v[i])
            {
                dfs(i, isConnected, v);
                count++;
            }
        }
        return count;
    }
    public void dfs(int city, int[][] isConnected, boolean[] visited)
    {
        visited[city] = true;

        for(int j = 0; j < isConnected.length; j++)
        {
            if(isConnected[city][j] == 1 && !visited[j])
            {
                dfs(j, isConnected, visited);
            }
        }
    }
}
