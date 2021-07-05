package com.jd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @Author: xielong7
 * @Date: 2021/6/30 16:24
 * @Version: V1.0.0
 * @Since: V1.0.0
 * @Description:
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends BaseEntity{
    private Integer id;
    private String name;

    List<Student> studentList;
}
