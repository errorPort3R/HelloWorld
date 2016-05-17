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

    public String[] getSpecificSections()
    {
        return sections;
    }

    public int getNumOfSections()
    {
        return count;
    }

    public Instructor[] getInstructors()
    {
        return instructors;
    }

    public void setSection(String name, int locationInArray)
    {
        if (isValidLocation(locationInArray))
        {
            sections[locationInArray] = name;
        }
        else
        {
            System.out.printf("\nNot a valid location");
        }
    }

    public void addSection(String name)
    {
        sections[count] = name;
        count++;
    }

    public void setInstructor(Instructor instructor, int i)
    {
        if (isValidLocation(i))
        {
            instructors[i] = instructor;
        }
        else
        {
            System.out.printf("\nNot a valid location");
        }
    }

    public void setCreditHours(int hours)
    {
        creditHours = hours;
    }

    public void setCourseName(String name)
    {
        courseName = name;
    }

    public void setCourseID(String id)
    {
        courseID = id;
    }

    //public void setCount(int count)
    //{
    //    this.count = count;
    //}

    private boolean isValidLocation(int i)
    {
        boolean isValid = (i >= 0 && i < count);
        return isValid;
    }
}
