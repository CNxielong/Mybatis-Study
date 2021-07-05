package com.jd.dao;

import com.jd.pojo.Blog;
import com.jd.utils.IDutil;
import com.jd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: xielong7
 * @Date: 2021/7/1 16:51
 * @Version: V1.0.0
 * @Since: V1.0.0
 * @Description:
 */
public class BlogTest {
    //    Logger
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //获得SqlSession对象
    SqlSession sqlSession = MybatisUtils.getSession();
    //方式1 getMapper
    BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);


    @Test
    public void test(){
        HashMap<String,Object> map = new HashMap<String,Object>();
        ArrayList<String> ids = new ArrayList<String>();
        ids.add("1");
        ids.add("2");
        ids.add("5");
        map.put("ids",ids);
        List<Blog> blogList = mapper.queryBlogForeach(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
    }


    @Test
    public void addInitBlog() {

        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("title","Java");
        map.put("author","这不是谢龙说的");
//        map.put("author.name","这不是谢龙说的");

//        List<Blog> blogList = mapper.queryBlogChoose(map);
        List<Blog> blogList = mapper.queryBlogIf(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }

//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("title","Mybatis如此简单");
//        map.put("author","狂神说");
//        List<Blog> activeBlogWithTitleLike = mapper.findActiveBlogWithTitleLike(map);
//        for (Blog blog : activeBlogWithTitleLike) {
//            System.out.println(blog);
//        }

//        Blog blog = new Blog();
//        blog.setId(IDutil.genId());
//        blog.setTitle("Mybatis如此简单");
//        blog.setAuthor("这不是谢龙说的");
//        blog.setCreateTime(new Date());
//        blog.setViews(9999);
//        mapper.addBlog(blog);
//        blog.setId(IDutil.genId());
//        blog.setTitle("Java如此简单");
//        mapper.addBlog(blog);
//        blog.setId(IDutil.genId());
//        blog.setTitle("Spring如此简单");
//        mapper.addBlog(blog);
//        blog.setId(IDutil.genId());
//        blog.setTitle("微服务如此简单");
//        mapper.addBlog(blog);

        sqlSession.close();
    }


}
