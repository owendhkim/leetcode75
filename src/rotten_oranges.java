import java.util.LinkedList;
import java.util.Queue;

public class rotten_oranges
{
    public int orangesRotting(int[][] grid)
    {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int freshOrange = 0;
        int minutes = 0;

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(grid[i][j] == 2)
                {
                    q.add(new int[] {i,j});
                }
                else if(grid[i][j] == 1)
                {
                    freshOrange++;
                }
            }
        }
        if(freshOrange == 0) return 0;

        int[][] directions = {{-1,0},{1,0},{0,1},{0,-1}};

        while(!q.isEmpty() && freshOrange > 0)
        {
            int size = q.size();

            for(int i = 0; i < size; i++)
            {
                int [] cur = q.poll();
                for(int[] dir : directions)
                {
                    int x = cur[0] + dir[0];
                    int y = cur[1] + dir[1];

                    if(x >= 0 && x < row && y >= 0 && y < col && grid[x][y] == 1)
                    {
                        grid[x][y] = 2;
                        q.add(new int[] {x,y});
                        freshOrange--;
                    }
                }
            }
            minutes++;
        }
        if(freshOrange > 0) return -1;
        return minutes;
    }
}
