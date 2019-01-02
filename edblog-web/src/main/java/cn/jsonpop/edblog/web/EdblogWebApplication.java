package cn.jsonpop.edblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = {"cn.jsonpop.edblog.service.*.*.mapper"})
@ComponentScan(basePackages = {"cn.jsonpop.edblog.service", "cn.jsonpop.edblog.web", "cn.jsonpop.edblog.common"})
public class EdblogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdblogWebApplication.class, args);
    }

}

