package ac.cnu.realcodingapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("group", 10);
        return "index";
    }
}
