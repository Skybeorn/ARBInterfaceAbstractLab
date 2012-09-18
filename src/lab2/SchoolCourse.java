/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Skybeorn
 */
public interface SchoolCourse {

    public abstract void setCourseNum(String courseNum);

    public abstract void setCourseName(String courseName);

    public abstract void setCredits(double credits);

    public abstract void setPrequisites(boolean value);

    public int getCredits();

    public abstract void getCourseNum(String courseNum);

    public abstract void getCourseName(String courseName);

    public abstract void getPrequisites(boolean value);
}
