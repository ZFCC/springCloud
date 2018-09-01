package com.sn.springCloud10;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MyApplication {

    public static void main(String args[]){
        new SpringApplicationBuilder(MyApplication.class).properties("spring.config.location=classpath:/application.properties").run(args);
    }
}
