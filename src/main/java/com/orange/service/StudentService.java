package com.orange.service;

import com.github.pagehelper.PageInfo;
import com.orange.entity.Students;

/**
 * @author Orange
 * @create 2020-11-07 11:13
 */

public interface StudentService {

    //查询全部学生信息
    PageInfo<Students> queryAllStudents(int pageNum, int pageSize, String studentId);

}
