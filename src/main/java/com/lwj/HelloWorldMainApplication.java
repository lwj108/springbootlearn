package com.lwj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 李维俊 on 2018/6/10.
 * @SpringBootApplication 标注一个主程序类,说明这是一个SpringBoot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //sping应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
