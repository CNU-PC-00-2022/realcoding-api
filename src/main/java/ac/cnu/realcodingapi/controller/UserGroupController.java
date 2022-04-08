package ac.cnu.realcodingapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserGroupController {
    @GetMapping("/api")
    public String index() {
        return "index";
    }
}
