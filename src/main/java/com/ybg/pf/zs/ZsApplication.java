package com.ybg.pf.zs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer
public class ZsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZsApplication.class, args);
    }
}
