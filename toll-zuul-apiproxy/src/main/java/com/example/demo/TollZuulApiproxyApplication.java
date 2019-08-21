package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class TollZuulApiproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TollZuulApiproxyApplication.class, args);
	}

}
