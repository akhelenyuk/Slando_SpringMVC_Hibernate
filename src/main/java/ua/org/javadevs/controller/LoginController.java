package ua.org.javadevs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.org.javadevs.entity.User;
import ua.org.javadevs.service.UserService;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/toLoginPage")
    public String getLoginPage(){
        return "login";
    }

    @RequestMapping("/getUserAccount")
    public String getUserAccount(){
          return "main";
    }

    @RequestMapping("/registernewuser")
    public String getRegistrationPage(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/savenewuser")
    public String saveNewUser(@ModelAttribute("user") User user){
        if(userService.saveNewAccount(user)){
            String message = "User successfully registered";
            return "redirect:/toLoginPage";
        } else{
            String message = "Error. User with such login already exists. Try another one.";
            return "redirect:/registernewuser";
        }

    }
}
