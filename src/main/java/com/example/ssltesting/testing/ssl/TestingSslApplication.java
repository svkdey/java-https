package com.example.ssltesting.testing.ssl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/")
public class TestingSslApplication {
	@GetMapping("test")
	public ResponseEntity<String> get(){
		return ResponseEntity.ok("this is response");
	}
	public static void main(String[] args) {
		SpringApplication.run(TestingSslApplication.class, args);
	}

}
