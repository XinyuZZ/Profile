package com.page.page;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.EventRecodingLogger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Xinyu Zhu
 * @version 7/8/2022 00:49
 */
@Controller
public class Page {
    @GetMapping("/")
    public String getWebsite() {
        return "主动脉夹层.html";
    }
}
