package Fourth;

import java.util.*;

/**
 * Course
 */
class Course {
    // including course code, title, description, capacity, and schedule.
    private String courseCode;
    private String title;
    private String description;
    private int capicity;
    private String shedule;
    private List<Student> registeredStudent;

    public Course(String courseCode, String title, String description, int capicity, String shedule) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capicity = capicity;
        this.shedule = shedule;
        this.registeredStudent = new ArrayList<>();
    }

    public String getCourceCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapicity() {
        return capicity;
    }

    public String getShedule() {
        return shedule;
    }

    public int getAvilabeSeats() {
        return capicity - registeredStudent.size();
    }

    public boolean registeredStudent(Student student) {
        if (registeredStudent.size() < capicity) {
            registeredStudent.add(student);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeStudent(Student student) {
        return registeredStudent.remove(student);
    }

    public List<Student> getRegisteredStudent() {
        return registeredStudent;
    }

    @Override
    public String toString() {
        return "Cource code: " + courseCode + "\nTitle: " + title + "\nDiscription: " + description + "\nCapicity: "
                + capicity + "\nShedule: " + shedule + "Avilable Seats: " + getAvilabeSeats();
    }
}