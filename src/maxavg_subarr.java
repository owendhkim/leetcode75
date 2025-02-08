public class maxavg_subarr
{
    public double findMaxAverage(int[] nums, int k)
    {
        int sum = 0;
        for(int i = 0; i < k; i++)
        {
            sum += nums[i];
        }
        int maxavg = sum / k;
        for(int i = 0; i < nums.length - k; i++)
        {
            //sliding window
            //swap oldest element with new one
            sum -= nums[i];
            sum += nums[i + k];
            if(maxavg < (sum / k)) {
                maxavg = sum / k;
            }
        }
        return maxavg;
    }

    public static void main(String args[])
    {
        maxavg_subarr s = new maxavg_subarr();
        System.out.println(s.findMaxAverage(new int[]{-1}, 1));
    }
}
