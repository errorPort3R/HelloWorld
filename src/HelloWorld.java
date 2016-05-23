import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jeffryporter on 5/18/16.
 */
public class HelloWorld
{
    public static void main(String[] args)
    {

        ArrayList<String> names = new ArrayList<String>();
        names.add("alice");
        names.add("bob");
        names.add("Charlie");

        String name = names.get(0);

        names.remove(1);

        HashMap<String, String> person = new HashMap<String, String>();
        person.put("name", "Alice Cooper");

        person.put("address", "17 Princess Street");

        person.get("name");

        person.remove("name");

        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("John", 10);
        scores.put("Bob", 7);
        scores.put("Charlie", 5);

        int score = scores.get("Bob");

        /*
        System.out.printf("Hello Dave!");
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "bob";
        names[2] = "Charlie";

        for(String name: names)
        {
            System.out.println(name);
        }

        int i = 0;
        while (i<5)
        {
            System.out.println("Hello");
            i++;
        }
        int score = 1;
        double health = 100.0;
        boolean isAlive = true;

        Integer.valueOf("123");
        Double.valueOf("10.5");
        */

    }
}
