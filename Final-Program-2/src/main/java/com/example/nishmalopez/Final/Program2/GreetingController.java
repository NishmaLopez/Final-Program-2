package com.example.nishmalopez.Final.Program2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
    @RequestMapping("/")
    public String getGreeting (Model model) {
        model.addAttribute("greeting", "Good Morning, I'm Nishma Lopez, future Graphic Designer and Artist. I hope you like my work!");
        return "greeting";
    }
}
