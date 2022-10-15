import java.util.ArrayList;

public class Student {
    private String name;
    private String DOB;
    private int age ;
    private int id;
    private ArrayList<CourseProgramme> courses;
    private ArrayList<Module> modulesReg;

    public Student(String name, String DOB, int age, int id) {
        this.name = name;
        this.DOB = DOB;
        this.age = age;
        this.id = id;
        this.courses = new ArrayList<>();
        this.modulesReg = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModulesReg() {
        return modulesReg;
    }

    public void setModulesReg(ArrayList<Module> modulesReg) {
        this.modulesReg = modulesReg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return getName()+getAge();
    }
}