package com.orange.mapper;

import com.orange.entity.Students;

import java.util.List;

/**
 * @author Orange
 * @create 2020-11-07 11:07
 */

public interface StudentMapper {

    List<Students> queryAllStudents(String studentId);

    int addStudent(Students students);

    int updateStudent(Students students);

    int deleteStudent(int id);

}
