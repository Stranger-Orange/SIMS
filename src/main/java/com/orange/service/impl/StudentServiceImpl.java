package com.orange.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.orange.entity.Students;
import com.orange.mapper.StudentMapper;
import com.orange.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Orange
 * @create 2020-11-07 11:11
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public PageInfo<Students> queryAllStudents(int pageNum, int pageSize, String studentId) {
        System.out.println(pageSize);
        PageHelper.startPage(pageNum, pageSize);
        List<Students> students = studentMapper.queryAllStudents(studentId);
        PageInfo<Students> studentsPageInfo = new PageInfo<>(students);
        System.out.println(studentsPageInfo.getPageSize());
        return studentsPageInfo;
    }
}
