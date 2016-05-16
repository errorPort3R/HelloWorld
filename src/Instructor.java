/**
 * Created by jeffryporter on 5/16/16.
 */
public class Instructor {

    //declare variables
    private int MAX_NUM_COURSES_PER_SEMESTER = 15;
    private static int INSTRUCTOR_IDS = 10110;
    private Person person;
    private final int id;
    private Course[] coursesAssigned = new Course[MAX_NUM_COURSES_PER_SEMESTER];
    private int count = 0;

    public Instructor(String firstName, String lastName)
    {
        person = new Person(firstName, lastName);
        id = INSTRUCTOR_IDS;
        INSTRUCTOR_IDS++;
    }

    public String getFirstName()
    {
        return person.getFirstName();
    }

    public String getLastName()
    {
        return person.getLastName();
    }

    public String getName()
    {
        return person.getName();
    }

    public int getInstructorId()
    {
        return id;
    }

    public int getNumOfCoursesTaught()
    {
        return count;
    }

    public Course[] getCourses()
    {
        return coursesAssigned;
    }

    public void addCourse(Course course)
    {
        coursesAssigned[count] = course;
        count++;
    }

    public void removeCourse(String courseName)
    {
        boolean foundIt = false;
        for(int i=0;i<count;i++)
        {
            if (courseName.equals(coursesAssigned[i]))
            {
                foundIt = true;
                coursesAssigned[i]=coursesAssigned[i+1];
                count--;
            }
            else if (foundIt)
            {
                coursesAssigned[i]=coursesAssigned[i+1];
            }
        }
        if(!foundIt)
        {
            System.out.printf("\nNot Found!!!");
        }
    }

}
