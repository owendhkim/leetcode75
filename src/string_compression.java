public class string_compression
{
    public int compress(char[] chars)
    {
        if(chars.length == 1) return 1;
        char cur = chars[0];
        int count = 0;
        int write = 0;
        for(char c : chars)
        {
            if(cur == c)
            {
                count++;
            }
            else
            {
                chars[write++] = cur;
                if(count > 1)
                {
                    String cnt = String.valueOf(count);
                    for(char digit : cnt.toCharArray())
                    {
                        chars[write++] = digit;
                    }
                }
                count = 1;
                cur = c;
            }
        }
        chars[write++] = cur;
        if(count > 1)
        {
            String cnt = String.valueOf(count);
            for(char digit : cnt.toCharArray())
            {
                chars[write++] = digit;
            }
        }
        return write;
    }
}
