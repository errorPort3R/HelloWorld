/**
 * Created by jeffryporter on 5/16/16.
 * AM classwork
 */
public class Person {

    //declare variables
    private String firstName;
    private String lastName;
    private int age;
    private boolean isAlive = true;
    Person[] family = new Person[10];

    //constructors
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //methods
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }

    public void setFirstName(String newName)
    {
        firstName = newName;
    }

    public void setLastName(String newName)
    {
        lastName = newName;
    }
    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public void hasDied()
    {
        isAlive = false;
    }
}
