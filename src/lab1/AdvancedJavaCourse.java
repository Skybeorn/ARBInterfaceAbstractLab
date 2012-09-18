package lab1;

import javax.swing.JOptionPane;

public class AdvancedJavaCourse extends SchoolCourse {

    private double COURSE_CREDITS = 4;
    private String COURSE_CREDITS_ERR_MSG = "Error: credits must be 4.0";
    private String PREEQUSITE_COURSE = "Intro to Java";
    private String PREEQUSITE_COURSE_ERR_MSG = "Error: prerequisites cannot "
            + "be null of empty string";
    private String courseName;
    private String courseNumber;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNum(courseNumber);
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    PREEQUSITE_COURSE_ERR_MSG);
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCredits(double credits) {
        if (credits != COURSE_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    COURSE_CREDITS_ERR_MSG);
            System.exit(0);
        }
        this.setCredits(credits);
    }

    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNum() {
        return courseNumber;
    }

    public final void setCourseNum(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public void hasPrequisites(boolean t) {
        if (t = false) {
            throw new IllegalArgumentException(PREEQUSITE_COURSE);
        }
    }
}
