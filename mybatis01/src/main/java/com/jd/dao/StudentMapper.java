package com.jd.dao;

import com.jd.pojo.Student;

import java.util.List;

/**
 * @Author: xielong7
 * @Date: 2021/6/30 16:42
 * @Version: V1.0.0
 * @Since: V1.0.0
 * @Description:
 */
public interface StudentMapper {

    List<Student> listStudentList();

    List<Student> listStudentTeacherList();

    Student listStudentWithTeacherNameList(int id);
}
