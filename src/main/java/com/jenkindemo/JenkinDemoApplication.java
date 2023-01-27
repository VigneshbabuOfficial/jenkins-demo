package com.jenkindemo;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinDemoApplication {
	
	public static Logger log = Logger.getLogger("JenkinDemoApplication");

	public static void main(String[] args) {
		log.info("JenkinDemoApplication is executed ....");
		SpringApplication.run(JenkinDemoApplication.class, args);
	}
	
	public String testJenkinDemo() {
		log.info("testJenkinDemo is executed ....");
		return "welcome to Jenkin Demo";
	}
	

}
