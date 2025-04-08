public class reverse_vowels_string
{
    public String reverseVowels(String s)
    {
        int left = 0;
        int right = s.length()-1;
        char[] str = s.toCharArray();
        while(left < right)
        {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if(isVowel(l) && isVowel(r))
            {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;

            }
            else if(!isVowel(l))
            {
                left++;
            }
            else if(!isVowel(r))
            {
                right--;
            }
        }
        return new String(str);

    }
    public boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
