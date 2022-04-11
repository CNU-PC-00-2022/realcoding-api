package ac.cnu.realcodingapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // Controller는 페이지 자체를 가져옴
public class ViewController {
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("group", 10);
        return "index";
    }
}
