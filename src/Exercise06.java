/**
 * Created by jeffryporter on 6/22/16.
 */
public class Exercise06
{
    public static void main(String[] args)
    {
        int num = 12345;
        //54321
        int reverseInt= 0;
        String reverseString = "";
        String number = String.valueOf(num);
        for (int i = (number.length()-1); i >=  0; i--)
        {
            reverseString += number.charAt(i);
        }
        reverseInt = Integer.valueOf(reverseString);
        System.out.println(reverseInt);

        stringBuildermethod(num);
        solveViaMath(num);
    }

    public static void stringBuildermethod(int num)
    {
        StringBuilder s = new StringBuilder(String.valueOf(num));
        int reverseNum = Integer.valueOf(s.reverse().toString());
        System.out.println(reverseNum);
    }

    public static void solveViaMath(int num)
    {
        int reverseNum = 0;
        while (num != 0)
        {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num %10;
            num = num/10;
        }
        System.out.println(reverseNum);
    }
}
