package com.quest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Quest on 2017/7/24.
 */
@Controller
public class IndexController {
    @RequestMapping("index")
    public String toIndex(){
        return "index";
    }
    @RequestMapping("hello")
    public String showHello(){
        return "hello";
    }
}
