package ca.sheridancollege.kathpals.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GrommetController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/grommetFactory")
        public String processGrommets(){
        return "DisplayGrommets";
        }

}
