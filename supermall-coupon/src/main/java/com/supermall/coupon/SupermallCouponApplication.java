package com.supermall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.supermall.coupon.dao")
public class SupermallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupermallCouponApplication.class, args);
	}

}
