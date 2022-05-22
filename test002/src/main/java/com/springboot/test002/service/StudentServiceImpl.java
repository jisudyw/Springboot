package com.springboot.test002.service;

import com.springboot.test002.mapper.StudentMapper;
import com.springboot.test002.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Object getName(Integer id) {
        Student uerName = studentMapper.selectByPrimaryKey(id);

        return uerName.getClass();
    }

    @Override
    public int inster(HashMap<Object, Object> student) {
        int i = studentMapper.insertSelective(student);
        return i;
    }

    @Override
    public int update(Student student) {
        int i = studentMapper.updateByPrimaryKeySelective(student);
        return i;
    }

    @Override
    public Object delete(Integer id) {
       int i =  studentMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public Object get(Integer id) {
        Student s = studentMapper.selectByPrimaryKey(id);

        return s;
    }
}
