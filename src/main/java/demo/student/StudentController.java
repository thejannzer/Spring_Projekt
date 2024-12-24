package demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {


    @GetMapping("/hello")
    public List<Student> getStudents() {
        return List.of(
                new Student("Paul", 23, LocalDate.of(2000, Month.JANUARY, 5), "Paul@jo.de" )
        );
    }
}
