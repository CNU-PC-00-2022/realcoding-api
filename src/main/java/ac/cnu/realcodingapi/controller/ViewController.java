package ac.cnu.realcodingapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ViewController {
    @GetMapping("/index")
    public String index(Model model) {
        log.info("ViewController 실행됨.");
        model.addAttribute("group", 11);
        return "index";
    }
}