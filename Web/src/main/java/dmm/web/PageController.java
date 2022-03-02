package dmm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String MainPage(){
        return "mainPage";
    }
    @GetMapping("/firstPage")
    public String FirstPage(){
        return "firstPage";
    }
    @GetMapping("/donatePage")
    public String DonatePage(){
        return "donatePage";
    }
    @GetMapping("/underConstructionPage")
    public String UnderConstructionPage(){
        return "UnderConstructionPage";
    }
}
