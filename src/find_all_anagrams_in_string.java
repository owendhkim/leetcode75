import java.util.ArrayList;
import java.util.List;

public class find_all_anagrams_in_string
{
    public List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> list = new ArrayList<>();
        int[] letters = new int [26];

        int m = s.length();
        int n = p.length();

        if(m < n) return list;
        for(int i = 0; i < n; i++)
        {
            letters[s.charAt(i) - 'a']++;
            letters[p.charAt(i) - 'a']--;
        }
        if(isAnagram(letters)) list.add(0);

        for(int i = n; i < m; i++)
        {
            letters[s.charAt(i) - 'a']++;
            letters[s.charAt(i - n) - 'a']--;
            if(isAnagram(letters)) list.add(i - n + 1);
        }
        return list;
    }
    private boolean isAnagram(int[] a)
    {
        for(int n : a)
        {
            if(n != 0) return false;
        }
        return true;
    }
}

