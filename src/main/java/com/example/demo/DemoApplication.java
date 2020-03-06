package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;
@SpringBootApplication
@RestController

public class DemoApplication {

	@GetMapping("/")
	public String home(@RequestParam(value = "input1", defaultValue = "12") String input1, @RequestParam(value = "input2", defaultValue = "12") String input2) {
		//return "Hello";
		BigInteger mult; 
		//if input1='' and input2='';
		//{
		//String input1 = "100"; 
		//String input2 = "120";
		BigInteger a 
        = new BigInteger(input1); 
    BigInteger b 
        = new BigInteger(input2);
    

    // Using multiply() method 
    mult = a.multiply(b); 
    return mult.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
