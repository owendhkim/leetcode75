import java.util.LinkedList;
import java.util.Queue;

public class dota2_senate
{
    public String predictPartyVictory(String senate)
    {
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();

        for(int i = 0; i < senate.length(); i++)
        {
            if(senate.charAt(i) == 'R')
            {
                r.add(i);
            }
            else
            {
                d.add(i);
            }
        }

        Integer r_idx = r.poll();
        Integer d_idx = d.poll();

        while(true)
        {
            if(r_idx == null)
            {
                return "Dire";
            }
            if(d_idx == null)
            {
                return "Radiant";
            }
            if(r_idx < d_idx)
            {
                d_idx = d.poll();
                r.add(r_idx + senate.length());
                r_idx = r.poll();
            }
            else
            {
                r_idx = r.poll();
                d.add(d_idx + senate.length());
                d_idx = d.poll();
            }
        }
    }
}
