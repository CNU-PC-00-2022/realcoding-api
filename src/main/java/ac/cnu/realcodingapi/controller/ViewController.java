package ac.cnu.realcodingapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller // Controller는 페이지 자체를 가져옴
public class ViewController {
    @GetMapping("/index")
    public String index(Model model) {
        log.info("Info : ViewController입니다. ");
        model.addAttribute("group", 7);
        return "index";
    }
}
