/**
 * Created by jeffryporter on 5/17/16.
 */
public class Email {
    String subject;
    String body;
    String destination;
    int time;
    Person author;

    public Email()
    {

    }
    public Email(Person author, String subject, String body, String destination, int time)
    {
        this.author = author;
        this.subject = subject;
        this.body = body;
        this.destination = destination;
        this.time = time;
    }

    public Email(String subject, String body, String destination)
    {
        this.author = null;
        this.subject = subject;
        this.body = body;
        this.destination = destination;
        this.time = 0;
    }

    //methods
    public Person getAuthor()
    {
        return author;
    }

    public String getSubject()
    {
        return subject;
    }

    public String getBody()
    {
        return body;
    }

    public String getDestination()
    {
        return destination;
    }

    public int getTime()
    {
        return time;
    }

    public void setAuthor(Person author)
    {
        this.author = author;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public void setTime(int time)
    {
        if (isValidTime(time))
        {
            this.time = time;
        }
        else
        {
            time = 0;
            System.out.printf("\nNot a valid time!");
        }
    }

    public static boolean isValidTime(int time)
    {
        boolean isValid = time >= 0;
        return isValid;
    }

}