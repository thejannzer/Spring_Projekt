//implementiert die Logik
package demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student("Paul", 23, LocalDate.of(2000, Month.JANUARY, 5), "Paul@jo.de" )
        );
    }
}
