package com.jd.pojo;

import com.jd.pojo.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 *  用户
 * </p>
 *
 * @author xielong7
 * @since 2021-06-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String name;

    private String pwd;

//    public User(Integer id, String name, String pwd) {
//        this.id = id;
//        this.name = name;
//        this.pwd = pwd;
//    }
}
