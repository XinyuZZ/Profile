package com.page.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Xinyu Zhu
 * @version 13/8/2022 00:12
 */
@Controller
public class MentalTestController {
    @GetMapping("/testmain")
    public String getMaintest() {
        return "心理评测 - 主动脉夹层.html";
    }
}
