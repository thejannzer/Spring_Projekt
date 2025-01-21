package student.tests;

import demo.student.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    private Student student;

    // Testdaten
    private final String id = "123456";
    private final int age = 18;
    private final String name = "John Doe";

    @BeforeEach
    public void setUp() {
        // Initialisiert ein Student-Objekt vor jedem Test
        student = new Student(id, name, age);
    }

    @Test
    public void constructorTest() {
        assertNotNull(student);
        assertEquals(id, student.getId());
        assertEquals(name, student.getName());
        assertEquals(age, student.getAge());
    }

    @Test
    public void testGetId() {
        assertEquals(id, student.getId());
    }

    @Test
    public void testSetId() {
        String newId = "654321";
        student.setId(newId);
        assertEquals(newId, student.getId());
    }

    @Test
    public void testGetName() {
        assertEquals(name, student.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(age, student.getAge());
    }
}
