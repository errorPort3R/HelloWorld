import java.util.ArrayList;

/**
 * Created by jeffryporter on 6/9/16.
 */
public class exercise05
{
    //bubblesort
    public static void main(String[] args)
    {
        String[] names = {"Charlie", "Bob", "Alice", "David", "John", "Paul", "George", "Ringo", "Albert"};
        //
        ArrayList<String> sortedNames = new ArrayList<>();
        for(int i=0;i<names.length;i++)
        {
            for (int j=0;j<names.length;j++)
            {
                String temp;
                if (names[i].compareTo(names[j])<1)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        for(String name:names)
        {
            System.out.println(name);
        }
    }
}
