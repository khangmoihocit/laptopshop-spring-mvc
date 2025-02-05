package com.example.springmvc.controller;
import com.example.springmvc.domain.User;
import com.example.springmvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RestController
@Controller()
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/admin/user")
    public String createUser(Model model){
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create1", method= RequestMethod.POST)
    public String getHome(Model model, @ModelAttribute("newUser") User user){
        userService.handleSaveUser(user);
        return "hello";
    }




}
