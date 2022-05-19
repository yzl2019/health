package yzl.com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("yzl.com.dao")
public class ServiceProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderApp.class,args);
    }
}
