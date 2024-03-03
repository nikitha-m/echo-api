package com.infosys.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfosysController{
	 @PostMapping("/dataReceive")
	    public String receiveDataFromNode(@RequestBody Map<String, String> data) {
		 System.out.println("Received data from Node.js:");
	        System.out.println(data);
	        
	        // Return a response (optional)
	        return "Data received successfully";
	    }
}
