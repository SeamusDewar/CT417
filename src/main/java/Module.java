import java.util.ArrayList;

public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students;
    private Lecturer lecturer;

    private ArrayList<CourseProgramme> coursesAssociated;

    public Module(String name, String id, ArrayList students, Lecturer lecturer) {
        this.name = name;
        this.id = id;
        this.students = students;
        this.lecturer = lecturer;
        this.coursesAssociated = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public ArrayList<CourseProgramme> getCoursesAssociated() {
        return coursesAssociated;
    }

    public void setCoursesAssociated(ArrayList<CourseProgramme> coursesAssociated ) {
        this.coursesAssociated = coursesAssociated;
    }
}
