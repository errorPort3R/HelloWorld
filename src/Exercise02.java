import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jeffryporter on 5/26/16.
 */
public class Exercise02
{
    public static void main(String[] args) {
        Email e1 = new Email("Hi", "", "alice@theironyard.com");
        Email e2 = new Email("Hi", "", "bob@theironyard.com");
        Email e3 = new Email("Hi", "", "charlie@theironyard.com");
        Email e4 = new Email("Hi", "", "bob@theironyard.com");
        Email e5 = new Email("Hi", "", "charlie@theironyard.com");

        Email[] emails = {e1,e2, e3,e4, e5};


        //hashmap organizing emails by destination

        HashMap<String, ArrayList<Email>> map = new HashMap<>();

        for(Email email : emails)
        {
            ArrayList<Email> emailsList = map.get(email.destination);
            if (emailsList == null)
            {
                emailsList = new ArrayList<>();
                emailsList.add(email);
                map.put(email.destination, emailsList);
            }
            else
            {
                emailsList.add(email);
            }
        }

        //Second way to skin this cat
        map = new HashMap<>();
        for (Email email : emails)
        {
            if (!map.containsKey(email.destination))
            {
                map.put(email.destination, new ArrayList<>());
            }
            ArrayList<Email> emailsList = map.get(email.destination);
            emailsList.add(email);
        }
        System.out.println(map);

    }
}
