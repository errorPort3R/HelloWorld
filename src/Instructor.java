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

    public Instructor(String firstName, String lastName)
    {
        person = new Person(firstName, lastName);
        id = INSTRUCTOR_IDS;
        INSTRUCTOR_IDS++;
    }

    public int getInstructorId()
    {
        return id;
    }
    public Course getCourse(int i)
    {
        return coursesAssigned[i];
    }

}
