import java.util.HashSet;

public class longest_substr_without_repeating
{
    public int lengthOfLongestSubstring(String s)
    {
        int left = 0;
        int right = 0;
        int maxlen = 0;
        HashSet<Character> hs = new HashSet<>();

        while(right < s.length())
        {
            char curr = s.charAt(right);
            if(!hs.contains(curr))
            {
                hs.add(curr);
                maxlen = Math.max(maxlen, right - left + 1);
                right++;

            }
            else
            {
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}
