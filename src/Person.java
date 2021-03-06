import java.util.Arrays;

/**
 * Created by jeffryporter on 5/16/16.
 * AM classwork
 */
public class Person implements Comparable<Person>{

    //declare variables
    private static final int FAMILY_SIZE = 10;
    public final static int SENTINAL = -1;
    private String firstName;
    private String lastName;
    private int age;
    private boolean isAlive;
    Person[] family = new Person[FAMILY_SIZE];

    //constructors
    public Person(String firstName, String lastName, int age, boolean isAlive)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isAlive = isAlive;
    }

    public Person(String name, int age, boolean isAlive)
    {
        setName(name);
        this.age = age;
        this.isAlive = isAlive;
    }

    public Person()
    {

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

//    public String getName()
//    {
//        return (firstName + " " + lastName);
//    }

    public void setFirstName(String newName)
    {
        firstName = newName;
    }

    public void setLastName(String newName)
    {
        lastName = newName;
    }

    public void setName(String newName)
    {
        if (isFullName(newName))
        {
            String[] fields = newName.split(" ");
            firstName = fields[0];
            lastName = fields[(fields.length - 1)];
        }
        else
        {
            firstName = newName;
        }
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public boolean getIsAlive()
    {
        return isAlive;
    }

    public void hasDied()
    {
        isAlive = false;
    }

    public void hasRessurected()
    {
        isAlive = true;
    }

    public static boolean isFullName(String newName)
    {
        return newName.contains(" ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", family=" + Arrays.toString(family) +
                '}';
    }

    @Override
    public int compareTo(Person o)
    {
        return this.getFirstName().compareTo(o.getFirstName());
    }


}
