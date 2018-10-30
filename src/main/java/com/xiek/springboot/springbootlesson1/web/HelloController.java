package com.xiek.springboot.springbootlesson1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }


    @RequestMapping("/rest")
    @ResponseBody
    public Map<String, Object> rest() {

        Map<String, Object> data = new HashMap<String, Object>();

        data.put("1", "A");
        data.put("2", 2);

        return data;

    }
}
