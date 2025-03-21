public class domino_tromino_tiles
{
    public int numTilings(int n)
    {
        if(n == 1) return 1;
        if(n == 2) return 2;
        long[][] dp = new long[n + 1][3];

        // dp[i][0] ways to cover 2 x i board with full domino
        // dp[i][1] ways to cover 2 x i board with top cell empty
        // dp[i][2] ways to cover 2 x i board with bottom cell empty
        dp[1][0] = 1;
        dp[2][0] = 2;
        dp[2][1] = 1;
        dp[2][2] = 1;

        for(int i = 3; i < n + 1; i++)
        {
            dp[i][0] = (dp[i-1][0] + dp[i-2][0] + dp[i-1][1] + dp[i-1][2]) % 1000000007;
            dp[i][1] = (dp[i-1][2] + dp[i-2][0]) % 1000000007;
            dp[i][2] = (dp[i-1][1] + dp[i-2][0]) % 1000000007;
        }
        return (int)dp[n][0];
    }
}
