package com.page.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Xinyu Zhu
 * @version 13/8/2022 00:16
 */
@Controller
public class OrderController {
    @GetMapping("/order")
        public String getOrder(){
        return "预约心理辅导 - 主动脉夹层.html";
    }
}
