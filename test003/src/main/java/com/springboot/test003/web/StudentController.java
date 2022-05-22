package com.springboot.test003.web;

import com.springboot.test003.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot集成redis
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/put")
    public Object getUser(String key,String value){
        studentService.put(key,value);
        return "redis succcess";
    }
    @GetMapping(value = "/get/{key}")
    public Object get (@PathVariable("key") String key){
       String value = studentService.get(key);
        return value;
    }
}
