package Fourth;

import java.util.*;

class CourceManagmentSystem {
    private List<Course> courses;
    private List<Student> students;
    private Scanner in;

    public CourceManagmentSystem() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.in = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            displayMenu();
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    listCourses();
                    break;
                case 2:
                    registerStudent();
                    break;
                case 3:
                    studentRegistration();
                    break;
                case 4:
                    dropCourse();
                    break;
                case 5:
                    System.out.println("Exiting the System. GoodBye..!");
                    break;
                default:
                    System.out.println("Invalid Option, Please Try again.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("==== Course Managment System ====");
        System.out.println("1. List Avilable Courses");
        System.out.println("2. Registered a  New Student");
        System.out.println("3. Student Course Registration");
        System.out.println("4. Drop a course");
        System.out.println("5. Exit");
        System.out.println();
        System.out.print("Choose an Option: ");
    }

    private void listCourses() {
        if (courses.isEmpty()) {
            System.out.println("Np Courses Avialable.");
        } else {
            for (Course course : courses) {
                System.out.println(course);
                System.out.println("\n=============================\n");
            }
        }
    }

    private void registerStudent() {
        System.out.print("Enter Student ID: ");
        String studentID = in.nextLine();
        System.out.println();
        System.out.print("Enter Student Name: ");
        String studentName = in.nextLine();
        Student student = new Student(studentID, studentName);
        students.add(student);
        System.out.print("Student added Successfully.");
    }

    private void studentRegistration() {
        System.out.print("Enter Student ID: ");
        String studentID = in.nextLine();
        Student student = findByStudentID(studentID);
        if (student == null) {
            System.out.println("Student not Found..!");
        }
        System.out.println("Enter the Course Code to Register: ");
        String courseCode = in.nextLine();
        Course course = findByCourseID(courseCode);
        if (course == null) {
            System.out.println("Course not Found..!");
        }
        if (student.registeredcourse(course)) {
            System.out.println("Course Registration Successfully.");
        } else {
            System.out.println("Course Registratin Failed. Maybe is Allready register or course is full");
        }
    }

    private void dropCourse() {
        System.out.print("Enter StudentID: ");
        String stuID = in.nextLine();
        Student student = findByStudentID(stuID);
        if (student == null) {
            System.out.println("Student Not Found");
        }
        System.out.print("Enter Course code to Drop: ");
        String couID = in.nextLine();
        Course course = findByCourseID(couID);
        if (course == null) {
            System.out.println("Course Not Found");
        }
        if (student.dropcourse(course)) {
            System.out.println("Course Drop Successfully.");
        } else {
            System.out.println("Course Drop Failes. not Register for the Course");
        }
    }

    private Student findByStudentID(String stuID) {
        for (Student student : students) {
            if (student.getStudentId().equals(stuID)) {
                return student;
            }
        }
        return null;
    }

    private Course findByCourseID(String courseCode) {
        for (Course course : courses) {
            if (course.getCourceCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}