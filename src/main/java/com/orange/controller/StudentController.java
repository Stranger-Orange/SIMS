package com.orange.controller;

import com.github.pagehelper.PageInfo;
import com.orange.entity.Students;
import com.orange.mapper.StudentMapper;
import com.orange.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author Orange
 * @create 2020-11-07 11:14
 */

//@RestController
@Controller
@RequestMapping("/student")
@Api(tags = {"学生管理"})
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/allStudent")
    @ResponseBody
    @ApiOperation("分页查询所有学生")
    public PageInfo<Students> allStudent(@RequestParam(name = "pageNum", required = false, defaultValue = "1")int pageNum,
                                         @RequestParam(name = "pageSize", required = false, defaultValue = "10")int pageSize,
                                         @RequestParam(name = "studentId", required = false, defaultValue = "")String studentId) {
        return studentService.queryAllStudents(pageNum, pageSize, studentId);
    }

    @PostMapping("/addStudent")
    @ResponseBody
    @ApiOperation("增加学生")
    public String addStudent(@RequestBody Students students) {
        int i = studentMapper.addStudent(students);
        System.out.println(i);
        if (i == 0) {
            return "增加失败";
        } else {
            return "增加成功";
        }
    }

    @PutMapping("/updateStudent")
    @ResponseBody
    @ApiOperation("修改学生信息")
    public String updateStudent(@RequestBody Students students){
        int i = studentMapper.updateStudent(students);
        System.out.println(i);
        if (i == 0) {
            return "修改失败";
        } else {
            return "修改成功";
        }
    }

    @DeleteMapping("/deleteStudent")
    @ResponseBody
    @ApiOperation("删除学生")
    public String deleteStudent(int id) {
        int i = studentMapper.deleteStudent(id);
        System.out.println(i);
        if (i == 0) {
            return "删除失败";
        } else {
            return "删除成功";
        }
    }

}
