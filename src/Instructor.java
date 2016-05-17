/**
 * Created by jeffryporter on 5/16/16.
 */
public class Instructor {

    //declare variables
    public final static int MAX_NUM_COURSES_PER_SEMESTER = 15;
    private static int INSTRUCTOR_IDS = 10110;
    private Person person;
    private int id;
    private Course[] coursesAssigned = new Course[MAX_NUM_COURSES_PER_SEMESTER];
    private int count = 0;

    public Instructor(String firstName, String lastName, int id)
    {
        person = new Person(firstName, lastName, Person.SENTINAL, true);
        this.id = id;
    }

    public Instructor(String firstName, String lastName)
    {
        person = new Person(firstName, lastName, Person.SENTINAL, true);
        id = INSTRUCTOR_IDS;
        INSTRUCTOR_IDS++;
    }

    public Instructor(String name, int id)
    {
        person = new Person(name, Person.SENTINAL, true);
        this.id = id;
    }

    public Instructor(String name)
    {
        person = new Person(name, Person.SENTINAL, true);
        id = INSTRUCTOR_IDS;
        INSTRUCTOR_IDS++;
    }

    //methods
    public Person getPerson()
    {
        return person;
    }

    public int getInstructorId()
    {
        return id;
    }

    public int getNumOfCoursesTaught()  //getCount
    {
        return count;
    }

    public Course[] getCourses()
    {
        return coursesAssigned;
    }


    public void setPerson(Person person)
    {
        this.person = person;
    }

    public void setID(int newID)
    {
        id = newID;
    }

    public void addCourse(Course course)
    {
        coursesAssigned[count] = course;
        count++;
    }

    public void removeCourse(Course courseName)
    {
        boolean foundIt = false;
        for(int i=0;i<count;i++)
        {
            if (exists(courseName, coursesAssigned[i]))
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

    //public void setCount(int count)
    //{
    //    this.count = count;
    //}

    public static boolean exists(Course course, Course comparative)
    {
        boolean isInTheList = course.equals(comparative);
        return isInTheList;
    }
}
