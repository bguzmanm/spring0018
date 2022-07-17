package cl.awakelab.spring0018.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IniController {

    @GetMapping
    public String getInicio(){
        return "index";
    }

}
