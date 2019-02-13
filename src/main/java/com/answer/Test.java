package com.answer;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

public class Test {

    private static Log log = LogFactory.get(Test.class);

    public static void main(String[] args) {
        //测试 grep console
        System.out.println("this is java review");
        log.info("log info level");
        log.debug("log debug level");
        log.error("log error level");
    }
}
