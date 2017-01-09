package br.com.lojaonline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/loginAdmin", method=RequestMethod.GET)
    public String loginAdmin(){
        return "loginAdmin";
    }
}
