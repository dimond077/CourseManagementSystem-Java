package Fourth;

import java.util.*;

class Student {
    private String studentId;
    private String name;
    private List<Course> registeredcourse;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registeredcourse = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Course> getcourses() {
        return registeredcourse;
    }

    public boolean registeredcourse(Course course) {
        if (!registeredcourse.contains(course)) {
            if (course.registeredStudent(this)) {
                registeredcourse.add(course);
                return true;
            }
        }
        return false;
    }

    public boolean dropcourse(Course course) {
        if (registeredcourse.contains(course)) {
            registeredcourse.remove(course);
            course.removeStudent(this);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + "\nName: " + name + "\n Registered Cources: " + registeredcourse.size();
    }
}