import java.util.ArrayList;
import java.util.HashSet;

public class intersection_of_two_arrays
{
    public int[] intersection(int[] nums1, int[] nums2)
    {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        for(int num : nums1)
        {
            hs.add(num);
        }
        for(int num : nums2)
        {
            if(hs.contains(num))
            {
                intersection.add(num);
                hs.remove(num);
            }
        }
        int[] ans = new int[intersection.size()];
        for(int i = 0; i < intersection.size(); i++)
        {
            ans[i] = intersection.get(i);
        }
        return ans;

    }
}
