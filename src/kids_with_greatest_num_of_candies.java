import java.util.ArrayList;
import java.util.List;

public class kids_with_greatest_num_of_candies
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        List<Boolean> l = new ArrayList<>();
        int max = 0;
        for(int n : candies)
        {
            if(n > max) max = n;
        }
        for(int i = 0; i < candies.length; i++)
        {
            if(candies[i] + extraCandies < max)
            {
                l.add(false);
            }
            else l.add(true);
        }
        return l;
    }
}
