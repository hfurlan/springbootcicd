package br.com.hfurlan.springbootcicd.controller;

import br.com.hfurlan.springbootcicd.entity.Fraude;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index(Model model, Principal principal) {
        return "Blablba";
    }

    @GetMapping("/fraude")
    public Fraude fraude(Model model, Principal principal) {
        Fraude f = new Fraude();
        f.setId(10);
        return f;
    }
}
