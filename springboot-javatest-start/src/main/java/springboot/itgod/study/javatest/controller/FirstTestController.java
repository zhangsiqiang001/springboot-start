package springboot.itgod.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class FirstTestController {
    @GetMapping("/")
    public String getfirst() {
        return "true";
    }

}
