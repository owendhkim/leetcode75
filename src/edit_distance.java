public class edit_distance
{
    public int minDistance(String word1, String word2)
    {
        int m = word1.length();
        int n = word2.length();
        int[][] grid = new int[m+1][n+1];

        for(int i = 1; i < m+1; i++)
        {
            grid[i][0] = i;
        }
        for(int j = 1 ; j < n+1; j++)
        {
            grid[0][j] = j;
        }
        for(int i = 1; i < m+1; i++)
        {
            for(int j = 1; j < n+1; j++)
            {
                if(word1.charAt(i - 1) == word2.charAt(j - 1))
                {
                    grid[i][j] = grid[i-1][j-1];
                }
                else
                {
                    grid[i][j] = Math.min(grid[i-1][j-1], Math.min(grid[i-1][j], grid[i][j-1])) + 1;
                }
            }
        }
        return grid[m][n];
    }
}
