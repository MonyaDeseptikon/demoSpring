package Desepticon.Monya.demoSpring;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @RequestMapping("/artem")
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
