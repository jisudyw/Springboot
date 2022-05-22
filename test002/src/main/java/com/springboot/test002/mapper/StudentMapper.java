package com.springboot.test002.mapper;

import com.springboot.test002.model.Student;
import com.springboot.test002.model.StudentExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student row);

    int insertSelective(HashMap<Object, Object> row);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Student row, @Param("example") StudentExample example);

    int updateByExample(@Param("row") Student row, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student row);

    int updateByPrimaryKey(Student row);
}