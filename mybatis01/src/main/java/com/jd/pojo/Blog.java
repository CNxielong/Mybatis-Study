package com.jd.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author xielong7
 * @since 2021-07-01
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Blog extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 博客id
     */
    private String id;

    /**
     * 博客标题
     */
    private String title;

    /**
     * 博客作者
     */
    private String author;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 浏览量
     */
    private Integer views;


}
