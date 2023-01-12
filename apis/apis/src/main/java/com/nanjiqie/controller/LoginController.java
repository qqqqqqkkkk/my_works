package com.nanjiqie.controller;

import com.nanjiqie.service.LoginService;
import com.nanjiqie.states.LoginState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("login/{username}/{password}")
    public LoginState findPerson(@PathVariable("username") String username, @PathVariable("password") String password){
        System.out.println(password);
        return loginService.findPerson(username,password);
    }
}
