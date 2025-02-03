/**
 *
 * @author owenk
 */
class gcd_string {
    public String gcdOfStrings(String str1, String str2)
    {
        // if str1 is shorter than str2, swap
        // str1 = longer string
        // str2 = shorter string
        if(str1.length() < str2.length())
        {
            return gcdOfStrings(str2, str1);
        }
        else if(!(str1.startsWith(str2)))
        {
            return "";
        }
        else if(str2.isEmpty())
        {
            return str1;
        }
        else
        {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }

    public static void main(String[] args) {
        gcd_string s = new gcd_string();
        // Test cases
        System.out.println(s.gcdOfStrings("ABCABC", "ABC")); // Expected: "ABC"
        System.out.println(s.gcdOfStrings("ABABAB", "ABAB")); // Expected: "AB"
        System.out.println(s.gcdOfStrings("LEET", "CODE")); // Expected: ""
        System.out.println(s.gcdOfStrings("AAAAAA", "AAA")); // Expected: "AAA"
        System.out.println(s.gcdOfStrings("XYZXYZXYZ", "XYZXYZ")); // Expected: "XYZ"
    }
}