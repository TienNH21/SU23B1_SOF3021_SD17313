package su23b1.tiennh21.sd17313.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @GetMapping("say-hello")
    public String sayHello()
    {
        return "hello";
    }
}
