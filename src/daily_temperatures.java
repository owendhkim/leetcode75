import java.util.Stack;

public class daily_temperatures
{
    public int[] dailyTemperatures(int[] temperatures)
    {
        int n = temperatures.length;
        Stack<Integer> s = new Stack<>();
        int[] answer = new int[n];

        for(int i = 0; i < n; i++)
        {
            while(!s.isEmpty() && temperatures[i] > temperatures[s.peek()])
            {
                int idx = s.pop();
                answer[idx] = i - idx;
            }
            s.push(i);
        }
        return answer;
    }
}
