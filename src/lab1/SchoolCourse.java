package lab1;

public abstract class SchoolCourse {


    private int credits;

    public abstract void setCourseNum(String courseNum);

    public abstract void setCourseName(String courseName);

    public abstract void setCredits(double credits);
    
    public abstract void setPrequisites(boolean value);

    public int getCredits() {
        return credits;

    }
}
