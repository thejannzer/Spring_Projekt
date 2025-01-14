package demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhotoController {

    private List<Photo> db = List.of(new Photo("1", "hello.jpg"));

    @GetMapping("/")
   public String helloWorld() {
       return "Hello World";
   }

   @GetMapping("/photos")
    public List<Photo> getPhotos() {
        return db;
   }


}
