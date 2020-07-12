package ua.tut.study.chuksjokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.tut.study.chuksjokes.services.JokerService;

@Controller
public class JokesController {

    private final JokerService service;

    public JokesController(JokerService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String makeJoke(Model model){
        model.addAttribute("joke", service.getJoke());
        return "chucknorris";
    }
}
