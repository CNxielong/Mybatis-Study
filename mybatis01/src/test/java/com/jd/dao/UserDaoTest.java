package com.jd.dao;

import com.jd.pojo.User;
import com.jd.utils.IDutil;
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
public class UserDaoTest {

//    Logger
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //获得SqlSession对象
    SqlSession sqlSession = MybatisUtils.getSession();
    //方式1 getMapper
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    @Test
    public void userTest() {
        List<User> userList = mapper.getUserList();
        logger.info("你好啊，李银河！");
        //方式2 不推荐
        List<User> usersListSelect = sqlSession.selectList("com.jd.dao.UserMapper.getUserList");
        for (User user : userList) {//查询
            System.out.println(user);
        }

        //增加
//        int i = mapper.insertUser(new User(4, "谢龙", "你好啊"));
//        System.out.println("插入的结果是" + i);
//
//        //修改
//        int u = mapper.updateUserById(new User(4, "谢龙", "不告诉你密码"));
//        System.out.println("修改的结果是" + u);
//
//        //删除
//        boolean d = mapper.deleteUserById(4);
//        System.out.println("修改的结果是" + d);

        sqlSession.close();
    }


    @Test
    public void userMapTest(){
        HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("id",5);
        map.put("name","name5");
        map.put("pwd","pwd5");
        int i = mapper.insertUserByMap(map);
        System.out.println("插入了"+i+"条数据");

        String s = IDutil.genId();
    }



}
