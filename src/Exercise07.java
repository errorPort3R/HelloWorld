/**
 * Created by jeffryporter on 6/28/16.
 */
public class Exercise07
{
    public static void main(String[] args)
    {
        String s = "racecar";
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("Hello"));
        System.out.println(isPalindrome("asdfmfdsa"));
        System.out.println(isPalindrome("12345677654321"));
        System.out.println(isPalindrome("1234567890"));
        System.out.println(isPalindrome("1234.4321"));
        System.out.println(isPalindrome("$12n3#^#3n21$"));
        System.out.println(isPalindrome("OIUGH%^T908h0&*^%"));

        //date range
    }

    public static boolean isPalindrome(String input)
    {
        boolean isPal = true;
        for (int i=0, j=(input.length()-1); i< input.length(); i++, j--)
        {
            if((input.charAt(i) != input.charAt(j)))
            {
                isPal = false;
                i=input.length();
            }
            if (i >= j)
            {
                i=input.length();
            }
        }
        return isPal;
    }
}
