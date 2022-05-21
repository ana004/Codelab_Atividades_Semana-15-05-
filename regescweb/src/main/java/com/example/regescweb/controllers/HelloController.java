package com.example.regescweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HelloController {
    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("nome", "Maria!");
        return mv; //Spring vai renderizar o arquivo templates/hello.html
    }
    @GetMapping("/hello-model")
    public String hello(Model model) {
        model.addAttribute("nome", "Zezinho!");
        return "hello"; //Spring vai renderizar o arquivo templates/hello.html
    }

    @GetMapping("/hello-servlet")
    public String hello(HttpServletRequest  request) {
        request.setAttribute("nome", "Ana");
        return "hello"; //Spring vai renderizar o arquivo templates/hello.html
    }
}
