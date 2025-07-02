package Desepticon.Monya.demoSpring;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @RequestMapping(value = "/artem", method = RequestMethod.GET)
//    public ResponseEntity<List<Item>> getItems(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "size", defaultValue = "10") int size) {
//        List<Item> items = getItemsFromDatabase(page, size); // это просто пример
//        return new ResponseEntity<>(items, HttpStatus.OK);
//    }
    public String hello() {
        return "Привет , Артюша!";
    }

    @RequestMapping("/anastasia")
    public String hello2() {
        return "Привет , Настюша!";
    }

    @RequestMapping("/ilay")
    public String hello3() {
        return "Привет , Илай!";
    }
}
