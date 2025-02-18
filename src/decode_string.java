import java.util.Stack;

public class decode_string
{
    public String decodeString(String s)
    {
        Stack<Integer> numStk = new Stack<>();
        Stack<String> strStk = new Stack<>();

        int num = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                num = num * 10 + c - '0';
            }
            else if(c == '[')
            {
                strStk.push(Character.toString(c));
                numStk.push(num);
                num = 0;
            }
            else if(c == ']')
            {
                String str = "";
                int count = numStk.pop();
                StringBuilder sb = new StringBuilder();
                while(!(str = strStk.pop()).equals("["))
                {
                    sb.insert(0, str);
                }
                String temp = sb.toString();
                for(int j = 0; j < count - 1; j++)
                {
                    sb.append(temp);
                }
                strStk.push(sb.toString());
            }
            else
            {
                strStk.push(Character.toString(c));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!strStk.isEmpty())
        {
            sb.insert(0,strStk.pop());
        }
        return sb.toString();

    }
    public static void main(String args[])
    {
        decode_string d = new decode_string();
        String result = d.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef");
        System.out.println(result);
    }
}
