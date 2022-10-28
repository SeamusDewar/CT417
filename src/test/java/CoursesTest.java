import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoursesTest{

    @Test
    public void studentTest(){
        Student testStudent = new Student("Seamus Dewar", "26/06/2001", 21, 19471876);

        assertEquals("Seamus Dewar", testStudent.getName());
        assertEquals("26/06/2001", testStudent.getDOB());
        assertEquals(21, testStudent.getAge());
        assertEquals(19471876, testStudent.getId());
        assertEquals("Seamus Dewar21", testStudent.getUsername());
    }

    @Test
    public void lecturerTest(){
        Lecturer testLecturer = new Lecturer("John McClean", "17/05/1975", 47, 752983579);

        assertEquals("John McClean", testLecturer.getName());
        assertEquals("17/05/1975", testLecturer.getDOB());
        assertEquals(47, testLecturer.getAge());
        assertEquals(752983579, testLecturer.getId());
        assertEquals("John McClean47", testLecturer.getUsername());
    }

    @Test
    public void ModuleTest(){
        Student testStudent = new Student("Seamus Dewar", "26/06/2001", 21, 19471876);
        ArrayList<Student> testStudentsList = new ArrayList<>();
        testStudentsList.add(testStudent);

        Lecturer testLecturer = new Lecturer("John McClean", "17/05/1975", 47, 752983579);

        Module testModule = new Module("Professional Skills", "CT123", testStudentsList, testLecturer);

        assertEquals("Professional Skills", testModule.getName());
        assertEquals("CT123", testModule.getId());
        assertNotNull(testModule.getStudents(), "Students=Null");
        assertNotNull(testModule.getLecturer(), "Lecturer=Null");
    }

    @Test
    public void CourseTest(){
        Student testStudent = new Student("Seamus Dewar", "26/06/2001", 21, 19471876);
        ArrayList<Student> testStudentsList = new ArrayList<>();
        testStudentsList.add(testStudent);

        Lecturer testLecturer = new Lecturer("John McClean", "17/05/1975", 47, 752983579);

        Module testModule = new Module("Professional Skills", "CT123", testStudentsList, testLecturer);
        ArrayList<Module> testModulesList = new ArrayList<>();

        DateTime startDate = new DateTime("2022-09-01");
        DateTime endDate = new DateTime("2026-06-01");
        CourseProgramme testCourse = new CourseProgramme("Computer Science", testModulesList, testStudentsList, startDate, endDate);

        assertEquals("Computer Science", testCourse.getName());
        assertNotNull(testCourse.getModules(), "testModulesList=Null");
        assertNotNull(testCourse.getStudents(), "testStudentsList=Null");
        assertTrue((testCourse.getStartDate()) == (startDate));
        assertTrue((testCourse.getEndDate()) == (endDate));
    }
}