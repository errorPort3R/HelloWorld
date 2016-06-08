import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by jeffryporter on 6/8/16.
 */
public class Exercise04
{
    public static void main(String[] args)
    {
        String [] names = {"Alice", "Smith", "Bob", "Jones", "Charlie", "Brown"};
        HashMap<String, String> nameMap = new HashMap<>();

        //solution 1: traditional for-loop
        for(int i = 0;i<names.length;i+=2)
        {
            nameMap.put(names[i+1],names[i]);
        }

        //solution 2:
        nameMap = new HashMap<>();
        ArrayList<String> namesArr = new ArrayList(Arrays.asList(names));
        ArrayList<String> pair;
        while(namesArr.size()>0)
        {
            pair = new ArrayList<>(namesArr.subList(0,2));
            namesArr = new ArrayList<> (namesArr.subList(2, namesArr.size()));
            nameMap.put(pair.get(1), pair.get(0));
        }
        System.out.println(nameMap);
    }
}
