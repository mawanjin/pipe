package cn.first9.web.pipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class PipeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PipeApplication.class, args);
    }

}
