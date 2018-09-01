package com.sn.springCloud10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class InitController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWord(){
        String str = "today is interesting   \n"+new Date();
        return str;
    }

}
