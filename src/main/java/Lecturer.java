import java.util.ArrayList;

public class Lecturer {
    private String name;
    private String DOB;
    private int age ;
    private int id;
    private ArrayList<Module> modulesTeach;

    public Lecturer(String name, String DOB, int age, int id) {
        this.name = name;
        this.DOB = DOB;
        this.age = age;
        this.id = id;
        this.modulesTeach = new ArrayList<>();
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

    public ArrayList<Module> getModulesReg() {
        return modulesTeach;
    }

    public void setModulesReg(ArrayList<Module> modulesReg) {
        this.modulesTeach = modulesReg;
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