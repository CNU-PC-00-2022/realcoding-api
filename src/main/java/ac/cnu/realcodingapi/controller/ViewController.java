package ac.cnu.realcodingapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class ViewController {
    @GetMapping("/index")
    public String index(Model model) {
        log.info("view index controller입니다");
        model.addAttribute("group", 4);
        return "index";
    }
}
