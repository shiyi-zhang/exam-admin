package com.exam.yiyou.examadmin.utils;

/**
 * @author 张世一
 * @version 1.0
 */
public class HomeConstent {

    public static final String V1 = "/v1";

    public static String getVersionPath(String path) {
        return V1 + path;
    }

}
