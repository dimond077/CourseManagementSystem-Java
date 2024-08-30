package Fourth;

public class CourseDatabaseSystem {
    public static void main(String[] args) {
        CourceManagmentSystem cms = new CourceManagmentSystem();
        cms.addCourse(new Course("CP1", "CPP", "One of the most famus Coding Launguage", 25, "Mon-Fry 8:00-3:00"));
        cms.addCourse(new Course("JA1", "JAVA", "Platform Indepent no poiter like CPP", 50, "Mon-Fry 8:00-3:00"));
        cms.addCourse(new Course("PY1", "Python", "Easy to Lean You can litrally do any thing", 100, "Mon-Fry 8:00-3:00"));

        cms.start();
    }
}

