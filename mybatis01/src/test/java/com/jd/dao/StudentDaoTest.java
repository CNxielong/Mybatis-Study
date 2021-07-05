package com.jd.dao;

import com.jd.pojo.Student;
import com.jd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: xielong7
 * @Date: 2021/6/19 20:31
 * @Version: V1.0.0
 * @Since: V1.0.0
 * @Description:
 */
public class StudentDaoTest {

//    Logger
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //获得SqlSession对象
    SqlSession sqlSession = MybatisUtils.getSession();
    //方式1 getMapper
    StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

    @Test
    public void StudentTest() {
//        List<Student> studentList = mapper.listStudentList();
        List<Student> studentList = mapper.listStudentTeacherList();
        logger.info("你好啊，李银河！");

        for (Student student : studentList) {
            System.out.println(student);
        }

          //删除
//        boolean d = mapper.deleteStudentById(4);
//        System.out.println("修改的结果是" + d);

        Student student = mapper.listStudentWithTeacherNameList(2);
        System.out.println("序号为2的student:"+student);

        sqlSession.close();
    }

}
