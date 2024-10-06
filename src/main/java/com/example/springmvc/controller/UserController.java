package com.example.springmvc.controller;
import com.example.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller()
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/admin/user/create1", method= RequestMethod.POST)
    public String getHome(Model model){
        String test = userService.handleHello();
        model.addAttribute("khang", test);
        model.addAttribute("x", "100");
        return "hello";
    }

    @RequestMapping(value = "/admin/user")
    public String createUser(Model model){
        return "admin/user/create";
    }


}
