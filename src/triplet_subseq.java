public class triplet_subseq {
    public boolean increasingTriplet(int[] nums)
    {
        int fst = Integer.MAX_VALUE;
        int snd = Integer.MAX_VALUE;
        int thrd = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            if(fst >= nums[i])
            {
                fst = nums[i];
            }
            else if(snd >= nums[i])
            {
                snd = nums[i];
            }
            else if(thrd >= nums[i])
            {
                thrd = nums[i];
                System.out.println(Integer.toString(fst) + " "  + Integer.toString(snd) + " " + Integer.toString(thrd));
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        triplet_subseq t = new triplet_subseq();
        t.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13});
    }
}
