package com.alibaba.nacos;

import com.alibaba.nacos.client.config.common.ConfigConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Alay
 * @date 2021-08-08 01:42
 * @see {个人博客 https://www.cnblogs.com/Alay/p/15116662.html}
 * 官方源码中：console 包中复制而来的主启动类
 * 源码运行便于开发,生产环境建议直接重官网下载 docker 镜像运行
 */
@EnableScheduling
@ServletComponentScan
@SpringBootApplication
public class AlibabaNacosApplication {

    public static void main(String[] args) {

        /**
         *设置单击模式启动
         */
        System.setProperty(ConfigConstants.STANDALONE_MODE, "true");
        /**
         * 是否开启认证
         */
        System.setProperty(ConfigConstants.AUTH_ENABLED, "false");

        SpringApplication.run(AlibabaNacosApplication.class, args);
    }
}
