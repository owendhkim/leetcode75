public class koko_eating_bananas
{
    public int minEatingSpeed(int[] piles, int h)
    {
        int left = 1;
        int right = 0;
        for(int pile : piles)
        {
            if(pile > right) right = pile;
        }
        while(left < right)
        {
            int mid = (left + right) / 2;
            if(canEatAll(piles, mid, h))
            {
                right = mid;
            }
            else
            {
                left = mid + 1;
            }
        }
        return left;
    }
    public boolean canEatAll(int[] piles, int k, int h)
    {
        for(int pile : piles)
        {
            h -= (pile - 1) / k + 1;
        }
        return h >= 0;
    }
}
