/**
 *
 * Created by jeffryporter on 5/16/16.
 */

public class Course {
    //declare variables
    private int numSections;
    private String courseID;
    private String courseName;
    private int creditHours;
    private String[] sections =  new String[numSections];
    private Instructor[] instructors = new Instructor[numSections];

    //constructor
    public Course(String id, String name, int hours, int numSections)
    {
        courseID = id;
        courseName = name;
        creditHours = hours;
    }

    //methods
    public String getSpecificSection(int i)
    {
        return sections[i];
    }

    public void setSection(String name, int locationInArray)
    {
        sections[locationInArray] = name;
    }

    public Instructor getSpecificInstructor(int i)
    {
        return instructors[i];
    }

    public void setInstructor(Instructor instructor, int i)
    {
        instructors[i] = instructor;
    }

}
