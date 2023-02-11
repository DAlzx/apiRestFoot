package com.example.apiRestFoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping()
@SpringBootApplication
public class ApiRestFootApplication {

	@GetMapping
	public ResponseEntity<Map<String, Object>> hello(){
		Map<String, Object> responses = new HashMap<>();
		responses.put("hello", "Welcome to my first API");
		return ResponseEntity.ok(responses);
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiRestFootApplication.class, args);
	}

}
