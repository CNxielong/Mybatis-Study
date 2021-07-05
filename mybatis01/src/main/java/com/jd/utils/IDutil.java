package com.jd.utils;

import java.util.UUID;

/**
 * UUID工具类
 * @Author: xielong7
 * @Date: 2021/7/1 15:38
 * @Version: V1.0.0
 * @Since: V1.0.0
 *
 */
public class IDutil {
    public static String genId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
