package com.jd.dao;

import com.jd.pojo.Teacher;
import com.jd.pojo.User;
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
public class TeacherDaoTest {

    //    Logger
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //获得SqlSession对象
    SqlSession sqlSession = MybatisUtils.getSession();
    //方式1 getMapper
    TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

    @Test
    public void test() {
        List<Teacher> teacherList = mapper.listTeacherList();

//        for (Teacher teacher : teacherList) {
//            System.out.println(teacher);
//        }

        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        logger.info("你好啊，李银河！");

        sqlSession.close();
    }

}
