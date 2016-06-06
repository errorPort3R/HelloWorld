import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by jeffryporter on 6/6/16.
 */
public class Exercise03
{
    public static void main(String[] args)
    {
        String[] names = {"Alice", "Bob", "Charlie", "Andrew", "Edward"};



        //SOLUTION 1
        //Arraylist of strings that contains the names with only capital Letters
        ArrayList<String> upperNames = new ArrayList<>();
        for (String name: names)
        {
            upperNames.add(name.toUpperCase());

        }
        System.out.println(upperNames);



        //SOLUTION 2
        //filter out names that dont start with 'A'
        for(int i = 0; i< upperNames.size();i++)
        {
            if (!upperNames.get(i).startsWith("A"))
            {
                upperNames.remove(i);
                i--;
            }
        }
        System.out.println(upperNames);

        upperNames = new ArrayList<>();
        for (String name: names)
        {
            upperNames.add(name.toUpperCase());

        }
        System.out.println(upperNames);
        //filter out names that dont start with 'A'
        ArrayList<String> tempNames = new ArrayList<>();
        for(String upperName: upperNames)
        {
            if (upperName.startsWith("A"))
            {
                tempNames.add(upperName);
            }
        }

        //SOLUTION 3 use Iterator
        //filter out names that dont start with 'A'
        for(int i = 0; i< upperNames.size();i++)
        {
            if (!upperNames.get(i).startsWith("A"))
            {
                upperNames.remove(i);
                i--;
            }
        }
        System.out.println(upperNames);

        Iterator<String> iter = upperNames.iterator();
        while (iter.hasNext())
        {
            String name = iter.next();
            if (!name.startsWith("A"))
            {
                iter.remove();
            }
        }

        //SOLUTION$ use a stream
        ArrayList<String> newNames = new ArrayList<>();
        for (String name: names)
        {
            newNames.add(name);
        }
        newNames = newNames.parallelStream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name)-> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(newNames);
    }

}
