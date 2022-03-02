package dmm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String mainPage(){
        return "mainPage";
    }
    @GetMapping("/firstPage")
    public String TestPage(){
        return "firstPage";
    }
}
