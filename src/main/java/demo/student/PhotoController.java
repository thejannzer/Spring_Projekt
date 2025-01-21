package demo.student;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.UUID;

@Controller
public class PhotoController {

    private Map<String, Photo> db = new HashMap<>(){
        {put("1", new Photo("1", "hello.jpg"));}
    };

    @GetMapping("/")
   public String helloWorld() {
       return "students";
   }

   @GetMapping("/photos/{id}")
   //konkretes Photo aus Liste
   public Photo getPhotos(@PathVariable String id) {
        Photo photo = db.get(id);
        if (photo == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return photo;
   }
   

   /*
   @PostMapping("/photoss")
    public Photo create(@RequestPart("") Photo photo) {} */
}
