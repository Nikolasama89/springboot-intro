package gr.aueb.cf.helloapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/coding")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello People!!");
        return "index";
    }

    @GetMapping("/welcome")
    public String sayWelcome(@RequestParam(defaultValue = "Guest") String name, Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }


}
