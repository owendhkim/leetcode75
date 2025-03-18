import java.util.Comparator;
import java.util.PriorityQueue;

public class total_cost_to_hire_k_workers
{
    public long totalCost(int[] costs, int k, int candidates)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>
        (
                new Comparator<int[]>()
                {
                    @Override
                    public int compare(int[] a, int[] b)
                    {
                        if(a[0] != b[0]) return Integer.compare(a[0], b[0]);
                        return Integer.compare(a[1], b[1]);
                    }
                }
        );
        int left = 0;
        int right = costs.length - 1;
        long total = 0;

        for(int i = 0; i < candidates && left <= right; i++)
        {
            pq.add(new int[] {costs[left],left});
            left++;
        }
        for(int i = 0; i < candidates && left <= right; i++)
        {
            pq.add(new int[] {costs[right],right});
            right--;
        }
        for(int i = 0; i < k; i++)
        {
            int[] hire = pq.poll();
            total += hire[0];
            int idx = hire[1];

            if(left <= right)
            {
                if(idx > right)
                {
                    pq.add(new int[] {costs[right],right});
                    right--;
                }
                else
                {
                    pq.add(new int[] {costs[left],left});
                    left++;
                }
            }

        }
        return total;
    }
}
