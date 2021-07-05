package com.jd.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jd.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xielong7
 * @since 2021-07-01
 */
public interface BlogMapper extends BaseMapper<Blog> {

    //新增一个博客
    int addBlog(Blog blog);

    List<Blog> findActiveBlogWithTitleLike(Map map);

    List<Blog> queryBlogChoose(Map map);

    List<Blog> queryBlogIf(Map map);

    List<Blog> queryBlogForeach(Map map);

}
