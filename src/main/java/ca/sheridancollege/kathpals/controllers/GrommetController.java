package ca.sheridancollege.kathpals.controllers;

import ca.sheridancollege.kathpals.model.Grommet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class GrommetController {

    List<Grommet> grommets = new CopyOnWriteArrayList<>();

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/grommetFactory")
        public String processGrommets(Model model, @RequestParam int numRed, @RequestParam String redSymbol,
                                      @RequestParam int numBlue, @RequestParam String blueSymbol,
                                      @RequestParam int numGreen, @RequestParam String greenSymbol){

        for (int i=1; i<=numRed;i++)
            grommets.add(new Grommet("Red",redSymbol));

        for (int i=1; i<=numBlue;i++)
            grommets.add(new Grommet("Blue",blueSymbol));

        for (int i=1; i<=numGreen;i++)
            grommets.add(new Grommet("Green",greenSymbol));

        for (int i=0;i<grommets.size()/20;i++)
            grommets.add(new Grommet("Magenta","#"));

        model.addAttribute("grommetList",grommets);

        return "DisplayGrommets";
        }

}
