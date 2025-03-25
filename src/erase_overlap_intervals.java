import java.util.Arrays;

public class erase_overlap_intervals
{
    public int eraseOverlapIntervals(int[][] intervals)
    {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1],b[1]));
        int end = Integer.MIN_VALUE;
        int count = 0;
        for(int[] arr : intervals)
        {
            if(arr[0] >= end)
            {
                count++;
                end = arr[1];
            }
        }
        return intervals.length - count;
    }
}
