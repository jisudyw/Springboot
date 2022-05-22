package com.springboot.test002.service;

import com.springboot.test002.model.Student;

import java.util.HashMap;

public interface StudentService {
    Object getName(Integer id);

    int inster(HashMap<Object, Object> student);

    int update(Student student);

    Object delete(Integer id);

    Object get(Integer id);
}
