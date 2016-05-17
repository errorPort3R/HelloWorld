/**
 * Created by jeffryporter on 5/16/16.
 */
public class Major {

    //declare variables
    private int MAX_NUM_OF_COURSES_PER_MAJOR = 100;
    private String name;
    private Course[] requiredCourses = new Course[MAX_NUM_OF_COURSES_PER_MAJOR];
    private int totalCreditHours;
    private int count = 0;

    //constructor
    public Major(String name)
    {
        this.name = name;
    }

    public String getMajorName()
    {
        return name;
    }

    public Course[] getRequiredCourses()
    {
        return requiredCourses;
    }

    public int getCreditHours()
    {
        return totalCreditHours;
    }
    public int numOfCourses()
    {
        return count;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setTotalCreditHours(int totalCreditHours)
    {
        this.totalCreditHours = totalCreditHours;
    }

    //public void setCount(int count)
    //{
    //    this.count = count;
    //}

    public void addCourse(Course course)
    {
        requiredCourses[count] = course;
        count++;
        totalCreditHours += course.getCreditHours();
    }

    public void removeCourse(Course course)
    {
        boolean foundIt = false;
        for(int i=0;i<count;i++)
        {
            if (exists(course, requiredCourses[i]))
            {
                foundIt = true;
                requiredCourses[i]=requiredCourses[i+1];
                count--;
                totalCreditHours -= course.getCreditHours();
            }
            else if (foundIt)
            {
                requiredCourses[i]=requiredCourses[i+1];
            }
        }
        if(!foundIt)
        {
            System.out.printf("\nNot Found!!!");
        }
    }

    public boolean exists(Course course, Course comparative)
    {
        boolean isInTheList = course.equals(comparative);
        return isInTheList;
    }
}
