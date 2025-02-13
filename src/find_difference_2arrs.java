import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class find_difference_2arrs
{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2)
    {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++)
        {
            hs1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++)
        {
            hs2.add(nums2[i]);
        }
        for(int num : hs1)
        {
            if(!(hs2.contains(num)))
            {
                l1.add(num);
            }
        }
        for(int num : hs2)
        {
            if(!(hs1.contains(num)))
            {
                l2.add(num);
            }
        }
        answer.add(l1);
        answer.add(l2);
        return answer;
    }
}
