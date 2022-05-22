package com.springboot.test001.service;

import com.springboot.test001.model.Student;

public interface StudentService {
    Object getUserName(Student student);

    Object insterInfo(Student student);

    Object update(Student student);

    Object delete(Student student);
}
