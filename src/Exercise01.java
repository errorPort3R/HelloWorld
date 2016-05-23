import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jeffryporter on 5/23/16.
 */
public class Exercise01
{
    public static void main(String[] args)
    {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Andrea", "Albert", "Beth"};
        HashMap<String, ArrayList<String>> nameMap = new HashMap<>();
        for(String name : names)
        {
            char firstLetter = name.charAt(0);
            String letter  =  String.valueOf(firstLetter);
            ArrayList<String> arr = nameMap.get(firstLetter);
            if (arr == null)
            {
                arr = new ArrayList<>();
                arr.add(name);
                nameMap.put(letter, arr);
            }
            else
            {
                arr.add(name);
            }
        }

        System.out.println(nameMap);

    }
}
