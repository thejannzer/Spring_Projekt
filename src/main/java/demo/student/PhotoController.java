package demo.student;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

@RestController
public class PhotoController {

    private Map<String, Photo> db = new HashMap<>(){
        {put("1", new Photo("1", "hello.jpg"));}
    };

    @GetMapping("/")
   public String helloWorld() {
       return "Hello World";
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
}
