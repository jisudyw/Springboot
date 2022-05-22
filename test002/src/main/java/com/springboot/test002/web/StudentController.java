package com.springboot.test002.web;

import com.springboot.test002.model.Student;
import com.springboot.test002.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;

/**
 * restfull接口案例，连接数据库进行增删改差
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/get/{id}")
    public Object getName(@PathVariable( "id") Integer id){
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("id",id);
//        String name = (String)studentService.getName((Integer) objectObjectHashMap.get("id"));
        return objectObjectHashMap;
    }

    @PostMapping(value = "/inster")
    public Object inster(
                         @PathParam("name") String name,
                         @PathParam("age") Integer age,
                         @PathParam("passwod") String password){
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("name",name);
        objectObjectHashMap.put("age",age);
        objectObjectHashMap.put("passwod",password);
       int i =  studentService.inster(objectObjectHashMap);
        return i ;
    }
    @PutMapping(value = "/update/{id}")
    public Object update(@PathVariable("id") Integer id,
                         @PathParam("name") String name,
                         @PathParam("age") Integer age,
                         @PathParam("password") String password){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setPasswod(password);
        int i =  studentService.update(student);
        return i ;
    }
    @DeleteMapping(value = "/delete/{id}")
    public Object delete(
            @PathVariable( "id") Integer id){
        Student student = new Student();
        student.setId(id);
         return   studentService.delete(student.getId());
    }

    @RequestMapping(value = "/getUser")
    public Object get(Integer id){
        Student student = new Student();
        student.setId(id);
        return   studentService.get(student.getId());
    }
}
