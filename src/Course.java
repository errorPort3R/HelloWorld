/**
 *using concurrent arrays, instead of an additional 'section' class
 * Created by jeffryporter on 5/16/16.
 */

public class Course {
    //declare variables
    private int numSections;
    private String courseID;
    private String courseName;
    private int creditHours;
    private String[] sections;
    private Instructor[] instructors;
    int count = 0;

    //constructor
    public Course(String id, String name, int hours, int numSections)
    {
        courseID = id;
        courseName = name;
        creditHours = hours;
        sections =  new String[numSections];
        instructors = new Instructor[numSections];
    }

    //methods
    public String getCourseID()
    {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours()
    {
        return creditHours;
    }

    public String getSpecificSection(int i)
    {
        return sections[i];
    }

    public void setSection(String name, int locationInArray)
    {
        sections[locationInArray] = name;
    }

    public void addSection(String name)
    {
        sections[count] = name;
        count++;
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
