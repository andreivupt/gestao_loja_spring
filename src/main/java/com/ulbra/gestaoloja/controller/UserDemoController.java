package com.ulbra.gestaoloja.controller;

import com.ulbra.gestaoloja.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo/user")
public class UserDemoController {

    @Autowired
    UserRepository userRepository;
}
