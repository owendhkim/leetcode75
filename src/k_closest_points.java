import java.util.PriorityQueue;

public class k_closest_points
{
    public int[][] kClosest(int[][] points, int k)
    {
        PriorityQueue<int[]> minheap = new PriorityQueue<>(
                (a,b) -> Double.compare(ecd(a), ecd(b))
        );
        int[][] ans = new int[k][2];
        for(int[] p : points)
        {
            minheap.add(p);
        }
        for(int i = 0; i < k; i++)
        {
            ans[i] = minheap.remove();
        }
        return ans;
    }

    public double ecd(int[] p1)
    {
        int xDiff = p1[0] - 0;
        int yDiff = p1[1] - 0;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
