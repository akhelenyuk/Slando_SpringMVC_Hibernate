package ua.org.javadevs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.org.javadevs.entity.User;

@Controller
public class LoginController {
    @RequestMapping("/toLoginPage")
    public String getLoginPage(){
        return "login";
    }

    @RequestMapping("/getUserAccount")
    public String getUserAccount(){
          return "main";
    }

    @RequestMapping("/registerNewUser")
    public String getRegistrationPage(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }
}
