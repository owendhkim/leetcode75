import java.util.Arrays;

public class reverse_string
{
    public String reverseWords(String s)
    {
        String[] result = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = result.length - 1; i >= 0; i--)
        {
            sb.append(result[i].trim());
            if(i > 0 && !(result[i].trim().equals("")))
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        reverse_string r = new reverse_string();

        String s = r.reverseWords("a good   example");
        System.out.println(s);
    }

}
