package com.page.page;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
*   @author Xinyu Zhu
*   @version 10/8/2022 10:16
*/


@RestController
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "welcome to spring boot application";
    }
}

