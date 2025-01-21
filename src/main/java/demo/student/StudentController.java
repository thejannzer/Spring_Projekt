package demo.student;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    @GetMapping("/")
    public String helloWorld() {
       return "students";
   }

}
