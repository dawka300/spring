package dawid.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dawid {

    @GetMapping("/hello-world")
    public String index() {
        return "<h1>Hello World</h1>";
    }
}
