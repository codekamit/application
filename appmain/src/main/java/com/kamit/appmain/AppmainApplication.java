package com.kamit.appmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.kamit.*")
public class AppmainApplication {
	public static void main(String[] args) {
		var context = SpringApplication.run(AppmainApplication.class, args);
	}
}
