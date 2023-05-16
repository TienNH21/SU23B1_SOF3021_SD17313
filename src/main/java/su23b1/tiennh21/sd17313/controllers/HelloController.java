package su23b1.tiennh21.sd17313.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HelloController {
    @GetMapping("say-hello")
    public String sayHello(Model model)
    {
        String username = "TienNH21";
        model.addAttribute("name", username);
        return "hello";
    }

    @ModelAttribute("chuyenNganh")
    public String getCNganh()
    {
        return "PTPM.Java";
    }

    @GetMapping("hello1")
    public String hello1()
    {
        return "redirect:/hello2";
    }

    @GetMapping("hello2")
    public String hello2()
    {
        return "hello2";
    }
}
