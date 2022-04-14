package ac.cnu.realcodingapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ViewController {
    @GetMapping("/index")
    public String index(Model model) {
        log.info("controller");
        model.addAttribute("group", 15);
        return "index";
    }
}
