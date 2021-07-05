package com.jd.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * SqlSessionFactory
 *
 * @Author: xielong7
 * @Date: 2021/6/19 18:14
 * @Version: V1.0.0
 * @Since: V1.0.0
 * @Description: SqlSessionFactory
 */
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream =
                    Resources.getResourceAsStream(resource);
            sqlSessionFactory = new
                    SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取SqlSession连接
    public static SqlSession getSession(){
//        return sqlSessionFactory.openSession();
        return sqlSessionFactory.openSession(true); //如果不设置参数或者参数为false就是手动提交事务，参数设置为true就是自动提交事务
    }

}
