package com.jd.dao;

import com.jd.pojo.Teacher;

import java.util.List;

/**
 * @Author: xielong7
 * @Date: 2021/6/30 16:42
 * @Version: V1.0.0
 * @Since: V1.0.0
 * @Description:
 */
public interface TeacherMapper {

    List<Teacher> listTeacherList();

    Teacher getTeacher(int id);
}
