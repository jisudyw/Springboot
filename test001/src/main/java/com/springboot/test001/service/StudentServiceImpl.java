package com.springboot.test001.service;

import com.springboot.test001.mapper.StudentMapper;
import com.springboot.test001.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student getUserName(Student student) {
        return studentMapper.selectByPrimaryKey(student.getId());
    }
    @Override
    public Object insterInfo(Student student) {
        return studentMapper.insertSelective(student);
    }

    @Override
    public Object update(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public Object delete(Student student) {
        return studentMapper.deleteByPrimaryKey(student.getId());
    }
}
