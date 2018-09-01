package com.sn.springCloud10;

import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class MyApplicationController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/myAPP")
    @ResponseBody
    public String getMyName(){
        String str = applicationContext.getEnvironment().getProperty("myAPP.environMent.name");
        return str+new Date();
    }
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User testUser(@PathVariable String id){
        User user = new User();
        user.setId(id);
        user.setAge(10);
        user.setUserName("niaho");
        user.setPassWord("123");
        return user;
    }
}
