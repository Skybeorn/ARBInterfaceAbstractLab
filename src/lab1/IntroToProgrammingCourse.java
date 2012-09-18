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
    private String courseName;
    private String courseNumber;
    private boolean prerequisites;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        setCourseNum(courseNumber);
        setCourseNum(courseNumber);
    }

    public boolean getPrerequisites() {
        return prerequisites;
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
        this.prerequisites = t;
    }
}
