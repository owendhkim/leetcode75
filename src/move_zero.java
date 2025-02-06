public class move_zero
{
    public void moveZeroes(int[] nums)
    {
        int zero = 0;

        for(int cur = 0; cur < nums.length; cur++)
        {
            if(nums[cur] != 0)
            {
                int tmp = nums[zero];
                nums[zero] = nums[cur];
                nums[cur] = tmp;
                zero++;
            }
        }
    }
}

