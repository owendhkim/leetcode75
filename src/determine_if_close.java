import java.util.HashMap;

public class determine_if_close
{
    public boolean closeStrings(String word1, String word2)
    {
        if(word1.length() != word2.length())
        {
            return false;
        }

        HashMap<Character, Integer> occ1 = new HashMap<>();
        HashMap<Character, Integer> occ2 = new HashMap<>();

        for(char c : word1.toCharArray())
        {
            occ1.put(c, occ1.getOrDefault(c,0) + 1);
        }
        for(char c : word2.toCharArray())
        {
            occ2.put(c, occ2.getOrDefault(c,0) + 1);
        }

        if(!(occ1.keySet().equals(occ2.keySet())))
        {
            return false;
        }

        HashMap<Integer,Integer> freq1 = new HashMap<>();
        HashMap<Integer,Integer> freq2 = new HashMap<>();

        for(int num : occ1.values())
        {
            freq1.put(num, freq1.getOrDefault(num, 0)+1);
        }
        for(int num : occ2.values())
        {
            freq2.put(num, freq2.getOrDefault(num, 0)+1);
        }

        if(freq1.equals(freq2))
        {
            return true;
        }
        return false;
    }

    public static void main(String args[])
    {
        determine_if_close s = new determine_if_close();
        System.out.println(s.closeStrings("cabbba","abbccc"));
    }
}
