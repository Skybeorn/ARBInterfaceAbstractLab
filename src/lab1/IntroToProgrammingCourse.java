package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends SchoolCourse {

    private double COURSE_CREDITS = 4;
    private String COURSE_CREDITS_ERR_MSG = "Error: credits must be between"
            + " .5 and 4.0";
    private String PREEQUSITE_COURSE = "None";
    private String PREEQUSITE_COURSE_ERR_MSG = "Error: prerequisites cannot "
            + "be null of empty string";
    private String courseName;
    private String courseNumber;
    private String prerequisites;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        setCourseNum(courseNumber);
        setCourseNum(courseNumber);
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
    public void setPrequisites(boolean t) {
        if (t = false) {
            throw new IllegalArgumentException(PREEQUSITE_COURSE);
        }
    }
}
