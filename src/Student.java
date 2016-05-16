/**
 * Created by jeffryporter on 5/16/16.
 */
public class Student {

    //declare variables
    private Person person;
    private final int id;
    private double gpa;
    private int creditHoursTaken;
    private static int CURRENT_ID_NUMBER = 8675309;

    //constructor
    public Student(String firstName, String lastName)
    {
        person = new Person(firstName, lastName);
        id = CURRENT_ID_NUMBER;
        CURRENT_ID_NUMBER++;
    }

    public double getGPA()
    {
        return gpa;
    }

    public void setGPA(double newGPA)
    {
        gpa = newGPA;
    }

    public int getCreditHoursTaken()
    {
        return creditHoursTaken;
    }

    public void setCreditHoursTaken(int creditHours)
    {
        creditHoursTaken = creditHours;
    }

}
