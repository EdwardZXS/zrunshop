package com.zrun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@MapperScan("com.zrun.mapper")
@SpringBootApplication
@ServletComponentScan
public class ZrunshopApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ZrunshopApplication.class, args);
	}
}
