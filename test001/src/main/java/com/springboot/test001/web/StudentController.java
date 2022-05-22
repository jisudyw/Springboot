package com.springboot.test001.web;

import com.springboot.test001.model.Student;
import com.springboot.test001.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/getUserName")
    public Object getUserName(Integer id){
        Student student = new Student();
        student.setId(id);
        return studentService.getUserName(student);

    }
    @RequestMapping(value = "/insterInfo")
    public Object insterInfo(String name,Integer age,String password){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setPasswod(password);
        studentService.insterInfo(student);
        return student;

    }
    @RequestMapping(value = "/update")
    public Object update(Integer id,String name,Integer age,String password){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setPasswod(password);
        studentService.update(student);
        return student;
    }
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(Integer id){
        Student student = new Student();
        student.setId(id);
        studentService.delete(student);
        return student;
    }

}
