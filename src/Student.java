/**
 * Created by jeffryporter on 5/16/16.
 */
public class Student {

    //declare variables
    private Person person;
    private int id;
    private double gpa;
    private int creditHoursTaken;
    private static int CURRENT_ID_NUMBER = 8675309;

    //constructors
    public Student(String firstName, String lastName, double gpa, int creditHoursTaken, int id)
    {
        person = new Person(firstName, lastName, Person.SENTINAL, true);
        this.id = id;
        setGPA(gpa);
        this.creditHoursTaken = creditHoursTaken;
    }

    public Student(String firstName, String lastName, double gpa, int creditHoursTaken)
    {
        person = new Person(firstName, lastName, Person.SENTINAL, true);
        id = CURRENT_ID_NUMBER;
        setGPA(gpa);
        this.creditHoursTaken = creditHoursTaken;
        CURRENT_ID_NUMBER++;
    }

    public Student(String name, double gpa, int creditHoursTaken, int id)
    {
        person = new Person(name, Person.SENTINAL, true);
        this.id = id;
        setGPA(gpa);
        this.creditHoursTaken = creditHoursTaken;
    }

    public Student(String name, double gpa, int creditHoursTaken)
    {
        person = new Person(name, Person.SENTINAL, true);
        id = CURRENT_ID_NUMBER;
        setGPA(gpa);
        this.creditHoursTaken = creditHoursTaken;
        CURRENT_ID_NUMBER++;
    }

    //methods
    public Person getPerson()
    {
        return person;
    }

    public int getID()
    {
        return id;
    }

    public double getGPA()
    {
        return gpa;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    public void setID(int newID)
    {
        id = newID;
    }

    public void setGPA(double newGPA)
    {
        if (isValidGPA(newGPA))
        {
            gpa = newGPA;
        }
        else
        {
            gpa = 0.0;
            System.out.printf("\nInvalid GPA.");
        }
    }

    public int getCreditHoursTaken()
    {
        return creditHoursTaken;
    }

    public void setCreditHoursTaken(int creditHours)
    {
        creditHoursTaken = creditHours;
    }

    public static boolean isValidGPA(double newGPA)
    {
        boolean isValid = (newGPA>=0 && newGPA<=4.0);
        return isValid;
    }

}
