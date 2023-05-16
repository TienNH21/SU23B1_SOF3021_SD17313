package su23b1.tiennh21.sd17313.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class LoginController {
    @GetMapping("login")
    public String getLoginForm()
    {
        return "login";
    }

    @PostMapping("login")
    public String login(
        @RequestParam("username") String username,
        @RequestParam("password") String password,
//        @RequestParam(name="remember", defaultValue = "false") boolean remember
        @RequestParam(name="remember") Optional<Boolean> remember
    ) {
        System.out.println(username);
        System.out.println(password);

        if (remember.isEmpty()) {
            System.out.println("Không nhớ đăng nhập");
        } else {
            System.out.println(remember.get());
        }

        return "login";
    }
}
