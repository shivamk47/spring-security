package com.shivam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value="/admin", method=RequestMethod.GET)
    public String privateHome() {
        return "privatePage";
    }
}