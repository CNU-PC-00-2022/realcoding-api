package ac.cnu.realcodingapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class ViewController {
    @GetMapping("/index")
    public String index(Model model) {
        log.info("view group controller입니다. ");
        model.addAttribute("group", 10);
        return "index";
    }
}
