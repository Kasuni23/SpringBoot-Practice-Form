package com.example.Example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

	@GetMapping("/info")
	public String info(
			@RequestParam(name = "FullName")String FullName,
			@RequestParam(name = "indexNumber")String indexNumber,
			@RequestParam(name = "batch")Integer batch,
			@RequestParam(name = "semNum")String semNum,
			@RequestParam(name = "regName")String regName){
		String message = "Dear Sir/Madam,<br>I am " + FullName + " of index number " + indexNumber + ". I am from batch " + batch + ". This is regarding the " + semNum + " module registration.<br>Please find my registration pdf in the attachment.<br>Thank you.<br>Best Regards,<br>" + regName;
		return message;
	}

}
